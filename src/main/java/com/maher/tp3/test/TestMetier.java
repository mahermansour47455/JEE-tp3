package com.maher.tp3.test;

import com.maher.tp3.metier.MetierImpl;
import com.maher.tp3.metier.Produit;

import java.util.List;

public class TestMetier {

    public static void main(String[] args) {
        MetierImpl metier= new MetierImpl();
        List<Produit> prods = metier.getProduitsParMotCle("HP");

        for (Produit p : prods)
            System.out.println(p.getNomProduit());
    }
}