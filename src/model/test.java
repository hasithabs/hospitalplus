/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import util.Config;
import util.Util;

/**
 *
 * @author kasun
 */
public class test {

    public static void main(String[] args) throws IOException {
        Config conf = new Config();
        String Sender = "kmkasunmadushanka@gmail.com,hasitha.bigwig@gmail.com,yashvida.1007@gmail.com";
        String Subject = "Hospital Plus";
        String body = "This is Thesting mail Fuckers!!!";

        Util.mailSender(Sender, Subject, body);
               
       
    }

}
