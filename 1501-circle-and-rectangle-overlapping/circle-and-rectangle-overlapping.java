class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        float  minx=Math.max(x1,Math.min(xCenter,x2));
        float  miny=Math.max(y1,Math.min(yCenter,y2));
        if((minx-xCenter)*(minx-xCenter)+(miny-yCenter)*(miny-yCenter)<= radius*radius) return true;
        return false;
    }
}