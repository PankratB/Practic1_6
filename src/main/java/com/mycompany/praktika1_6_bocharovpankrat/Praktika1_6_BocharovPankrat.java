/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktika1_6_bocharovpankrat;

import java.util.Scanner;

/**
 *
 * @author pankr
 */
public class Praktika1_6_BocharovPankrat {

    public static void main(String[] args) {
        System.out.println("Bocharov Pankrat Var 5");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name");
        String inputName = input.next();

        Store store = new Store();
        store.setName(inputName);

        Revizor revizor = new Revizor();
        revizor.closeStore(store);
        revizor.rebrand(store);
    }
}
