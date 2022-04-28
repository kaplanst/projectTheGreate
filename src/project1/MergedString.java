package project1;

import java.util.Arrays;

public class MergedString {
    public static void main(String[] args) {

        System.out.println(isMerge("udRsXusMT$? c%V;t_6r;NY ?2s94b8^7SWh>\\*\\g*cZ2udRsXusMT$? c%V;_eW6FLXU\"(eDVbo<@GS/i5S#P*,95(FOI*.&C>'h?RB6lP/8;[", "udRsXusMT$? c%V;_eW6FLXU\"(eDVbo<@GS/i5S#P", "udRsXusMT$? c%V;t_6r;NY ?2s94b8^7SWh>\\*\\g*cZ2*,95(FOI*.&C>'h?RB6lP/8;["));
    }
// 'udRsXusMT$? c%V;t_6r;NY ?2s94b8^7SWh>\*\g*cZ2udRsXusMT$? c%V;_eW6FLXU"(eDVbo<@GS/i5S#P*,95(FOI*.&C>'h?RB6lP/8;['
// 'udRsXusMT$? c%V;_eW6FLXU"(eDVbo<@GS/i5S#P'
// 'udRsXusMT$? c%V;t_6r;NY ?2s94b8^7SWh>\*\g*cZ2*,95(FOI*.&C>'h?RB6lP/8;['
    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;

        for (int i = 0; i < s.length(); i++) {

            if (part1.charAt(0) == part2.charAt(0) && part1.length() > 1 && part2.length() > 1) {
                if (s.charAt(i + 1) == part1.charAt(1)) {
                    part1 = part1.substring(1);
                    System.out.print(s.charAt(i));
                } else {
                    part2 = part2.substring(1);
                    System.out.print(s.charAt(i));
                }
                continue;
            }

            if (s.charAt(i) == part1.charAt(0)) {
                System.out.print(part1.charAt(0));
                if (part1.length() > 1) part1 = part1.substring(1);

            } else if (s.charAt(i) == part2.charAt(0)) {
                System.out.print(part2.charAt(0));
                if (part2.length() > 1) part2 = part2.substring(1);
            } else return false;
        }

        return true;
    }

}
