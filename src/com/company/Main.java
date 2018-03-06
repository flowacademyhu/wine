package com.company;


import com.company.Ital.Aszu;
import com.company.Ital.Bor;

public class Main {
    public static void kiirBor(Bor bor) {
        System.out.println(bor);
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("aszu")) {
                Aszu aszu = new Aszu(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]));
                kiirBor(aszu);
                i += 2;
            } else {
                Bor bor = new Bor(args[i], Integer.parseInt(args[i + 1]));
                kiirBor(bor);
                i += 1;
            }
        }



    }
}

