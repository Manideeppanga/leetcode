class Robot {
    int width,height;
    int x,y;
    int dir;
    int[][] dirs = {
        {1, 0}, 
        {0, 1}, 
        {-1, 0}, 
        {0, -1}
    };
    String[] dirNames ={"East" ,"North" ,"West","South"};
    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }
    
    public void step(int num) {
         int cycle = 2 * (width + height) - 4;
        num %= cycle;
        if (num == 0 && cycle > 0) {
            num = cycle;
        }
        while (num-- > 0) {
            int nx = x + dirs[dir][0];
            int ny = y + dirs[dir][1];
            if (nx < 0 || nx >= width || ny < 0 || ny >= height) {
                dir = (dir + 1) % 4;
                nx = x + dirs[dir][0];
                ny = y + dirs[dir][1];
            }
            x = nx;
            y = ny;
        }
    }
    
    public int[] getPos() {
        return new int[]{x,y};
    }
    
    public String getDir() {
        return dirNames[dir];
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */