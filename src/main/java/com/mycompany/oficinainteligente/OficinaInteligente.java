/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oficinainteligente;

/**
 *
 * @author macbook
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OficinaInteligente {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String parsedata;
        Date data;
        Scanner leia = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/aaaa");
    
        System.out.println("Digite uma data:");
        parsedata = leia.nextLine();
    
        data = formatter.parse(parsedata);
    
        System.out.print(data);
        
        //Testando o git commit de outra maquina

    }

}
