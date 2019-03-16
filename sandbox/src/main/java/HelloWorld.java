class HelloWorld {
    public static void main (String args []) {
        Point p1 = new Point(6, 5);
        Point p2 = new Point(9, 3);
        System.out.println(distance(p1, p2));
    }
    public static double distance (Point p1, Point p2){
       return Math.sqrt(Math.abs(((p2.x -p1.x)*(p2.x -p1.x) - (p2.y -p1.y)*(p2.y -p1.y))));
    }

}