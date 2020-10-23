package linkedList;

import java.util.LinkedList;
import java.util.Queue;


public class ExemploLinkedList{
    public static void main(String[] args){
        Queue<String> filaBanco = new linkedList<>();
        filaBanco.add("Diogo");
        filaBanco.add("Aizen");
        filaBanco.add("Ichigo");
        filaBanco.add("Alissa");
        filaBanco.add("Inoue");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

    }
}