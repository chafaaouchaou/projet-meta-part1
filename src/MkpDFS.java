import java.util.*;

class Sac {
    int nom;
    int Capasite;

    public Sac(int nom, int capasite) {
        this.nom = nom;
        Capasite = capasite;
    }
}

class Sacwheight {
    Sac sac;
    int wheight;

    public Sacwheight(Sac sac) {
        this.sac = sac;
        this.wheight = 0;
    }
}

class Item {
    int nom;
    int poids;
    int valeur;

    public Item(int nom, int poids, int valeur) {
        this.nom = nom;
        this.poids = poids;
        this.valeur = valeur;
    }

}

class Obj {
    Sac sac;
    Item item;
    int weighttillnow;
    int profondeur;
    List<Obj> chemain;

    public Obj(Sac sac, Item item, int weighttillnow, int profondeur) {

        this.sac = sac;
        this.item = item;
        this.weighttillnow = weighttillnow;
        this.profondeur = profondeur;
        this.chemain = new ArrayList<>();
    }

    public void addNodeToChemain(Obj node) {
        chemain.add(node);
    }

    public List<Obj> getChemain() {
        return chemain;
    }

    public void updateChemain(List<Obj> newPath) {
        chemain = new ArrayList<>(newPath);
    }
}

class Retresult {
    int value;
    List<Obj> path;

    public Retresult(int value, List<Obj> path) {
        this.value = value;
        this.path = path;
    }
}

public class MkpDFS {

    // public static int Bestbenef = 0;
    // public static void main(String[] args)
    // {//////////////////////////////////////////////////////////////
    // int Bestbenef = 0;
    // List<Sac> sacs = new ArrayList<>();
    // List<Item> items = new ArrayList<>();
    // List<Obj> bestcombo = new ArrayList<>();
    // sacs = Data.getSacs(4);
    // items = Data.getItems(7);
    // Obj node = new Obj(null, null, 0,0);
    // Retresult result = dfs(node,items.size(), sacs,items,bestcombo,Bestbenef);
    // System.out.println("Bestbenef "+result.value);
    // for (Obj obj : result.path) {
    // if (obj.sac.nom!=sacs.size()-1) {
    // System.out.println("S " +obj.sac.nom +" - "+"I " +obj.item.nom );
    // }
    // }
    // }///////////////////////////////////////////////////////////////////////////////////////////////////////

    static Retresult dfs(Obj startNode, int limit, List<Sac> sacs, List<Item> items, List<Obj> bestcombo,
            int Bestbenef,int profdfssInt) {

                System.out.println("la valeur d patata est "+profdfssInt);

        Stack<Obj> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            Obj currentNode = stack.pop();
            List<Obj> currentPath = currentNode.getChemain();

            if (profdfssInt== currentNode.profondeur) {
                return new Retresult(Bestbenef,bestcombo);

                
            }

            if (currentNode.profondeur == limit) {

                int valeur = verifySolution(currentPath, sacs);

                if (valeur > Bestbenef) {
                    Bestbenef = valeur;
                    bestcombo.clear();
                    bestcombo.addAll(currentPath);
                }

            }

            if (currentNode.profondeur < limit) {
                for (Sac sac : sacs) {

                    Obj node = new Obj(sac, items.get(currentNode.profondeur),
                            currentNode.weighttillnow + items.get(currentNode.profondeur).poids,
                            currentNode.profondeur + 1);
                    List<Obj> newPath = new ArrayList<>(currentPath);
                    newPath.add(node);
                    node.updateChemain(newPath);
                    stack.push(node);

                }

            }

        }
        Retresult result = new Retresult(Bestbenef, bestcombo);
        return result;
    }

    static int verifySolution(List<Obj> currentPath, List<Sac> sacs) {
        Sacwheight[] sacswheit = new Sacwheight[sacs.size()];

        for (Sac sac : sacs) {
            sacswheit[sac.nom] = new Sacwheight(sac);
        }

        for (Obj obj : currentPath) {
            sacswheit[obj.sac.nom].wheight += obj.item.poids;
        }

        for (int i = 0; i < sacs.size() - 1; i++) {
            if (sacswheit[i].wheight > sacs.get(i).Capasite) {
                return -1;
            }
        }
        int totalValue = 0;

        for (Obj obj : currentPath) {
            if (obj.sac.nom != sacs.size() - 1) {

                totalValue = totalValue + obj.item.valeur;
            }

        }

        return totalValue;

    }

}
