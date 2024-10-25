package map;

import java.util.HashMap;

public class HashMAp {
public static void main(String[] args) {
	HashMap<Integer,String>h=new HashMap<Integer,String>();
	h.put(1, "jcdnc");
	h.put(2, "vdkmvk");
	h.put(2, "vnf");
	h.put(3, "vdkmvk");
	System.out.println(h);
	h.put(1, "jcdnc");
	h.put(2, "vdkmvk");
	h.put(4, "vnf");
	h.put(3, "vdkmvk");
	System.out.println(h);
	}
}
