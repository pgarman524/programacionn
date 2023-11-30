int x;
int y;
int ax;
int ay;
int bx;
int by;
int cx;
int cy;

void setup(){

  size(600,600);
  background(0);
  
  stroke(color(0, 255, 255)); // Para poner el color del punto R G B
  strokeWeight(5); // Cambiar el tamaño del punto
  
  ax = 0;
  ay = 0;
  bx = width;
  by = 0;
  cx = width / 2;
  cy = height;
  point(ax,ay);
  point(bx, by);
  point(cx, cy);
  
  x = floor(random(width));
  y = floor(random(height));
      stroke(color(255, 0, 0));
strokeWeight(5); // Cambiar el tamaño del punto
}

void draw(){

    point(x,y);
    
    int r = floor(random(3));
    
    if(r == 0){
        stroke(color(0, 0, 255)); 
        x = floor(lerp(x, ax, 0.5));
        y = floor(lerp(y, ay, 0.5));
    } else if(r == 1){
      stroke(color(0, 255, 0)); 
        x = floor(lerp(x, bx, 0.5));
        y = floor(lerp(y, by, 0.5));
    } else {
      stroke(color(120, 0, 120)); 
        x = floor(lerp(x, cx, 0.5));
        y = floor(lerp(y, cy, 0.5));
      
    }}
