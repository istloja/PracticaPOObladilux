/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.HashMap;

/**
 *
 * @author ist loja
 */
public class hashMapejemplo {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa =new HashMap<String,Integer>();
        mapa.put("Real Madrid", 1);
        mapa.put("Barcelona", 5);
        mapa.put("Real Madrid", mapa.get("Barcelona")+1);
        System.out.println(mapa.get("Barcelona"));
    }
}
