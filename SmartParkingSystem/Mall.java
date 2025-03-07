package SmartParkingSystem;

import java.util.HashMap;

public class Mall
{
    public Mall(){}
    private static HashMap<String,boolean[]> mallDetail=new HashMap<>();
    public Mall(String mallName,int n)
    {
        mallDetail.put(mallName,new boolean[n]);
    }
    public boolean[] isMallAvailable(String mallName)
    {
        if(!mallDetail.containsKey(mallName))
        {
            System.out.println("No mall is available with this "+mallName+" name!");
            return null;
        }
        return mallDetail.get(mallName);
    }
}
