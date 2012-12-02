/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package katanumerosromanos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Miguel
 */
public class NumerosRomanos {
    
    public String convert(int intInput){
        if(intInput == 0 || intInput > 2999)
            throw new IllegalArgumentException("Solo números del 1 al 3000 son permitidos");
        
        return convertToRoman(intInput).toString();
    }
    
    private StringBuilder convertToRoman(int intInput){
        StringBuilder result = new StringBuilder();
        Iterator<Entry<Integer, String>> it = conversion.entrySet().iterator();
    while (it.hasNext()){
        Map.Entry<Integer, String> pair = it.next();
        while (intInput >= pair.getKey()){
            result.append(pair.getValue());
            intInput -= pair.getKey();
        }
    }
    return result;
    }
    
    private static final HashMap<Integer, String> conversion = new LinkedHashMap<Integer, String>();
    static{
        conversion.put(1,"I");
        conversion.put(2,"II");
        conversion.put(3,"III");
        conversion.put(4,"IV");
        conversion.put(5,"V");
        conversion.put(6,"VI");
        conversion.put(7,"VII");
        conversion.put(8,"VIII");
        conversion.put(9,"IX");
        conversion.put(10,"X");
    }
    
    
}
