import java.util.ArrayList;
import java.util.List;

public class Data {


    static List<Integer> numbers = new ArrayList<>();
    static List<Integer> numbers2 = new ArrayList<>();
 
  








    public static List<Sac> getSacs(int count) {
        numbers.add(23);
        numbers.add(25);
        numbers.add(20);
        numbers.add(35);
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(88);
        numbers.add(22);
        numbers.add(9);
        numbers.add(55);
        numbers.add(18);
        numbers.add(7);
        numbers.add(29);
        numbers.add(91);
        numbers.add(42);
        numbers.add(60);
        numbers.add(14);
        numbers.add(77);
        numbers.add(30);
        numbers.add(99);
        numbers.add(25);
        numbers.add(50);
        numbers.add(8);
        numbers.add(6);
        numbers.add(33);
        numbers.add(40);
        numbers.add(70);
        numbers.add(80);
        numbers.add(95);
        numbers.add(65);
        numbers.add(44);
        numbers.add(27);
        numbers.add(75);
        numbers.add(51);
        numbers.add(63);
        numbers.add(83);
        numbers.add(11);
        numbers.add(37);
        numbers.add(68);
        numbers.add(90);
        numbers.add(52);
        numbers.add(2);
        numbers.add(15);
        numbers.add(69);
        numbers.add(23);
        numbers.add(85);
        numbers.add(78);
        numbers.add(73);
        numbers.add(47);
        numbers.add(19);
        numbers.add(53);
        numbers.add(97);
        numbers.add(39);
        numbers.add(32);
        numbers.add(92);
        numbers.add(54);
        numbers.add(87);
        numbers.add(96);
        numbers.add(26);
        numbers.add(86);
        numbers.add(41);
        numbers.add(16);
        numbers.add(13);
        numbers.add(36);
        numbers.add(58);
        numbers.add(74);
        numbers.add(38);
        numbers.add(34);
        numbers.add(76);
        numbers.add(59);
        numbers.add(64);
        numbers.add(98);
        numbers.add(31);
        numbers.add(24);
        numbers.add(49);
        numbers.add(94);
        numbers.add(56);
        numbers.add(17);
        numbers.add(21);
        numbers.add(48);
        numbers.add(81);
        numbers.add(57);
        numbers.add(61);
        numbers.add(71);
        numbers.add(84);
        numbers.add(43);
        numbers.add(66);
        numbers.add(93);
        numbers.add(72);
        numbers.add(28);
        numbers.add(79);
        numbers.add(82);
        numbers.add(89);
        numbers.add(62);
        numbers.add(46);
        numbers.add(100);
        numbers.add(1);
        numbers.add(70);
        numbers.add(58);
        numbers.add(47);
        numbers.add(23);
        numbers.add(49);
        numbers.add(6);
        numbers.add(38);
        numbers.add(14);
        numbers.add(29);
        numbers.add(53);
        numbers.add(96);
        numbers.add(86);
        numbers.add(65);
        numbers.add(32);
        numbers.add(68);
        numbers.add(97);
        numbers.add(83);
        numbers.add(25);
        numbers.add(15);
        numbers.add(36);
        numbers.add(67);
        numbers.add(21);
        numbers.add(77);
        numbers.add(40);
        numbers.add(64);
        numbers.add(11);
        numbers.add(34);
        numbers.add(22);
        numbers.add(3);
        numbers.add(81);
        numbers.add(62);
        numbers.add(91);
        numbers.add(50);
        numbers.add(7);
        numbers.add(19);
        numbers.add(93);
        numbers.add(41);
        numbers.add(51);
        numbers.add(57);
        numbers.add(78);
        numbers.add(52);
        numbers.add(87);
        numbers.add(26);
        numbers.add(44);
        numbers.add(30);
        numbers.add(2);
        numbers.add(4);
        numbers.add(12);
        numbers.add(16);
        numbers.add(76);
        numbers.add(99);
        numbers.add(95);
        numbers.add(8);
        numbers.add(13);
        numbers.add(90);
        numbers.add(98);
        numbers.add(5);
        numbers.add(17);
        numbers.add(94);
        numbers.add(84);
        numbers.add(33);
        numbers.add(69);
        numbers.add(92);
        numbers.add(80);
        numbers.add(9);
        numbers.add(31);
        numbers.add(18);
        numbers.add(48);
        numbers.add(24);
        numbers.add(39);
        numbers.add(74);
        numbers.add(10);
        numbers.add(82);
        numbers.add(63);
        numbers.add(46);
        numbers.add(20);
        numbers.add(45);
        numbers.add(85);
        numbers.add(54);
        numbers.add(60);
        numbers.add(72);
        numbers.add(56);
        numbers.add(28);
        numbers.add(75);
        numbers.add(71);
        numbers.add(59);
        numbers.add(37);
        numbers.add(27);
        numbers.add(43);
        numbers.add(88);
        numbers.add(42);
        numbers.add(61);
        numbers.add(55);
        numbers.add(73);
        List<Sac> sacs = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Sac sac = new Sac(i, numbers.get(i)); // Example initialization
            sacs.add(sac);
        }
        return sacs;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static List<Item> getItems(int count) {
        numbers2.add(3);
        numbers2.add(20);
        numbers2.add(12);
        numbers2.add(67);
        numbers2.add(88);
        numbers2.add(22);
        numbers2.add(5);
        numbers2.add(35);
        numbers2.add(77);
        numbers2.add(9);
        numbers2.add(55);
        numbers2.add(18);
        numbers2.add(7);
        numbers2.add(29);
        numbers2.add(91);
        numbers2.add(42);
        numbers2.add(60);
        numbers2.add(14);
        numbers2.add(45);
        numbers2.add(30);
        numbers2.add(99);
        numbers2.add(25);
        numbers2.add(50);
        numbers2.add(8);
        numbers2.add(6);
        numbers2.add(33);
        numbers2.add(40);
        numbers2.add(70);
        numbers2.add(80);
        numbers2.add(95);
        numbers2.add(65);
        numbers2.add(44);
        numbers2.add(27);
        numbers2.add(75);
        numbers2.add(51);
        numbers2.add(63);
        numbers2.add(83);
        numbers2.add(11);
        numbers2.add(37);
        numbers2.add(68);
        numbers2.add(90);
        numbers2.add(52);
        numbers2.add(2);
        numbers2.add(15);
        numbers2.add(69);
        numbers2.add(23);
        numbers2.add(85);
        numbers2.add(78);
        numbers2.add(73);
        numbers2.add(47);
        numbers2.add(19);
        numbers2.add(53);
        numbers2.add(97);
        numbers2.add(39);
        numbers2.add(32);
        numbers2.add(92);
        numbers2.add(54);
        numbers2.add(87);
        numbers2.add(96);
        numbers2.add(26);
        numbers2.add(86);
        numbers2.add(41);
        numbers2.add(16);
        numbers2.add(13);
        numbers2.add(36);
        numbers2.add(58);
        numbers2.add(74);
        numbers2.add(38);
        numbers2.add(34);
        numbers2.add(76);
        numbers2.add(59);
        numbers2.add(64);
        numbers2.add(98);
        numbers2.add(31);
        numbers2.add(24);
        numbers2.add(49);
        numbers2.add(94);
        numbers2.add(56);
        numbers2.add(17);
        numbers2.add(21);
        numbers2.add(48);
        numbers2.add(81);
        numbers2.add(57);
        numbers2.add(61);
        numbers2.add(71);
        numbers2.add(84);
        numbers2.add(43);
        numbers2.add(66);
        numbers2.add(93);
        numbers2.add(72);
        numbers2.add(28);
        numbers2.add(79);
        numbers2.add(82);
        numbers2.add(89);
        numbers2.add(62);
        numbers2.add(46);
        numbers2.add(100);
        numbers2.add(1);
        numbers2.add(70);
        numbers2.add(58);
        numbers2.add(47);
        numbers2.add(23);
        numbers2.add(49);
        numbers2.add(6);
        numbers2.add(38);
        numbers2.add(14);
        numbers2.add(29);
        numbers2.add(53);
        numbers2.add(96);
        numbers2.add(86);
        numbers2.add(65);
        numbers2.add(32);
        numbers2.add(68);
        numbers2.add(97);
        numbers2.add(83);
        numbers2.add(25);
        numbers2.add(15);
        numbers2.add(36);
        numbers2.add(67);
        numbers2.add(21);
        numbers2.add(77);
        numbers2.add(40);
        numbers2.add(64);
        numbers2.add(11);
        numbers2.add(34);
        numbers2.add(22);
        numbers2.add(3);
        numbers2.add(81);
        numbers2.add(62);
        numbers2.add(91);
        numbers2.add(50);
        numbers2.add(7);
        numbers2.add(19);
        numbers2.add(93);
        numbers2.add(41);
        numbers2.add(51);
        numbers2.add(57);
        numbers2.add(78);
        numbers2.add(52);
        numbers2.add(87);
        numbers2.add(26);
        numbers2.add(44);
        numbers2.add(30);
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(12);
        numbers2.add(16);
        numbers2.add(76);
        numbers2.add(99);
        numbers2.add(95);
        numbers2.add(8);
        numbers2.add(13);
        numbers2.add(90);
        numbers2.add(98);
        numbers2.add(5);
        numbers2.add(17);
        numbers2.add(94);
        numbers2.add(84);
        numbers2.add(33);
        numbers2.add(69);
        numbers2.add(92);
        numbers2.add(80);
        numbers2.add(9);
        numbers2.add(31);
        numbers2.add(18);
        numbers2.add(48);
        numbers2.add(24);
        numbers2.add(39);
        numbers2.add(74);
        numbers2.add(10);
        numbers2.add(82);
        numbers2.add(63);
        numbers2.add(46);
        numbers2.add(20);
        numbers2.add(45);
        numbers2.add(85);
        numbers2.add(54);
        numbers2.add(60);
        numbers2.add(72);
        numbers2.add(56);
        numbers2.add(28);
        numbers2.add(75);
        numbers2.add(71);
        numbers2.add(59);
        numbers2.add(37);
        numbers2.add(27);
        numbers2.add(43);
        numbers2.add(88);
        numbers2.add(42);
        numbers2.add(61);
        numbers2.add(55);
        numbers2.add(73);
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Item item = new Item(i, numbers2.get(i), numbers2.get(numbers2.size()-i-1)); // Example initialization
            items.add(item);
        }
        return items;
    }
}