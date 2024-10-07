/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.ArrayList;
import java.util.List;
import ma.project.beans.Developpeur;
import ma.project.beans.Manager;
import ma.project.beans.Personne;
import ma.project.service.DeveloppeurService;
import ma.project.service.ManagerService;

/**
 *
 * @author Asmaa
 */
public class Entreprise {

    public static void main(String[] args) {
        DeveloppeurService dev = new DeveloppeurService();
        ManagerService man = new ManagerService();

        dev.create(new Developpeur("Laili", 2000));
        dev.create(new Developpeur("Lagnidi", 1500));

        man.create(new Manager("Boss", 4000));

        for (Manager m : man.getAll()) {
            {
                System.out.println("le Manager est : " + m.getNom() + " " + m.getSalaire());
            }
            for (Developpeur d : dev.getAll()) {
                {
                    System.out.println("le Developpeur est : " + d.getNom() + " " + d.getSalaire());
                }

            }
        }
    }
}
