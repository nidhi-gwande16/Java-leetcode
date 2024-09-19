class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> cities =new HashSet<>();
        HashMap<String,String> map =new HashMap<>();
        
        for(List<String> path:paths){
            cities.add(path.get(0));
            cities.add(path.get(1));
            map.put(path.get(0),path.get(1));
            
        }
        String destination =" ";
        for(String city:cities)
        {
            if(map.containsKey(city)==false)
            {
                destination=city;
                break;
            }
        }
        return destination;
    }
}