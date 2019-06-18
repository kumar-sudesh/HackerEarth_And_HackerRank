
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
public class Strong_Password {
    
    static String special_char = "!@#$%^&*()-+";
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
       String password = in.next();
        System.out.println(strong(password));
    }
    
    static int strong(String password){
        int value =0;
       
        if(!password.chars().anyMatch(Character::isDigit)){
            value++;
        }
        if(!password.chars().anyMatch(Character::isLowerCase)){
            value++;
        }
        if(!password.chars().anyMatch(Character::isUpperCase)){
            value++;
        }
        if(!password.chars().anyMatch(ch->special_char.indexOf((char)ch)>=0)){
        value++;
    }
        value = Math.max(value, 6-password.length());
        return value;
    }
    
}
