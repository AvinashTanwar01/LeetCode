class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x=0;
        int y=0;
        visited.add(x+","+y);
        for(char c:path.toCharArray()){
            if(c=='N')y++;
            else if(c=='S')y--;
            else if(c=='E')x++;
            else if(c=='W')x--;

            String point= x+","+y;

            if(visited.contains(point)){
                return true;
            }

            visited.add(point);
        }   

        return false;
    }
}