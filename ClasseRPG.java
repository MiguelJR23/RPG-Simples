/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classerpg;

import javax.swing.JOptionPane;

public class ClasseRPG {
    public static void main(String[] args) {
        // Solicita os atributos do personagem
        int forca = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Força (0 a 10):"));
        int inteligencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Inteligência (0 a 10):"));
        int agilidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Agilidade (0 a 10):"));
      
        // Determina a classe com base nos atributos
        if (forca >= inteligencia && forca >= agilidade) {
            JOptionPane.showMessageDialog(null, "Classe escolhida: Guerreiro\nVocê domina o combate físico!");
        } else if (inteligencia >= forca && inteligencia >= agilidade) {
            JOptionPane.showMessageDialog(null, "Classe escolhida: Mago\nO conhecimento é seu maior poder!");
        } else if (agilidade >= forca && agilidade >= inteligencia) {
            JOptionPane.showMessageDialog(null, "Classe escolhida: Ladino\nVocê é ágil, furtivo e imprevisível!");
        } else {
            JOptionPane.showMessageDialog(null, "Classe indefinida. Tente equilibrar seus atributos.");
        }

        // Solicita a raça do personagem
        String raca = JOptionPane.showInputDialog("Escolha sua raça (Humano, Elfo, Anão, Orc):").toLowerCase();

        // Verifica a raça escolhida
        if (raca.equals("humano")) {
            JOptionPane.showMessageDialog(null, "Raça escolhida: Humano\nVersátil e equilibrado.");
        } else if (raca.equals("elfo")) {
            JOptionPane.showMessageDialog(null, "Raça escolhida: Elfo\nÁgil, elegante e em harmonia com a natureza.");
        } else if (raca.equals("anão")) {
            JOptionPane.showMessageDialog(null, "Raça escolhida: Anão\nResistente e excelente ferreiro.");
        } else if (raca.equals("orc")) {
            JOptionPane.showMessageDialog(null, "Raça escolhida: Orc\nForte, impetuoso e temido.");
        } else {
            JOptionPane.showMessageDialog(null, "Raça não reconhecida. Escolha entre Humano, Elfo, Anão ou Orc.");
        }

        // Solicita a origem do personagem
        String origem = JOptionPane.showInputDialog("Escolha sua origem (Floresta, Montanhas, Cidade, Ruínas):").toLowerCase();

        // Verifica a origem escolhida
        if (origem.equals("floresta")) {
            JOptionPane.showMessageDialog(null, "Origem: Floresta\nVocê cresceu entre árvores e animais selvagens.");
        } else if (origem.equals("montanhas")) {
            JOptionPane.showMessageDialog(null, "Origem: Montanhas\nVocê é resistente, moldado pela altitude.");
        } else if (origem.equals("cidade")) {
            JOptionPane.showMessageDialog(null, "Origem: Cidade\nVocê conhece a política, comércio e intrigas.");
        } else if (origem.equals("ruinas") || origem.equals("ruínas")) {
            JOptionPane.showMessageDialog(null, "Origem: Ruínas\nVocê aprendeu a sobreviver entre os escombros.");
        } else {
            JOptionPane.showMessageDialog(null, "Origem não reconhecida. Escolha entre Floresta, Montanhas, Cidade ou Ruínas.");
        }
    }
}
