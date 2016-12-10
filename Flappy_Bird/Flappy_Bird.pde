import javax.swing.JOptionPane;
import ddf.minim.*;

Minim minim;
AudioSample sound;

void setup() {
  size(1000,1000);
  minim = new Minim(this);
  sound = minim.loadSample("flap.wav");
}
float birdx = 500;
float birdy = 500;
float birdyvelocity = 0;
float gravity = 0.5;
float lowerpipe = random(1000);
float pipex = 1000;
int score = 0;
void draw() {
  noStroke();
  background(0, 102, 238);
  fill(255, 255, 85);
  ellipse(birdx, birdy, 20, 20);
  fill(0, 238, 17);
  rect(pipex, lowerpipe, 100, 1000);
  rect(pipex, lowerpipe - 1200, 100, 1000);
  birdyvelocity = birdyvelocity - gravity;
  birdy = birdy - birdyvelocity;
  pipex-=4;
  System.out.println(birdx + " " + birdy + " " + pipex);
  if(pipex < -100) {
    pipex = 1000;
    lowerpipe = random(1000);
    score++;
  }
  if(birdy > 1000 || birdy < 0) {
   JOptionPane.showMessageDialog(null, "You suck!!! -Dalia ");
   System.exit(0); 
  }
  if(intersects(birdx, birdy, pipex, lowerpipe, 100)) {
    JOptionPane.showMessageDialog(null, "россия священная наша держава! -Stalin Singing First Sentence of Russian National Anthem");
    System.exit(0);//bottom
  }
  if(intersects2(birdx, birdy, pipex, lowerpipe - 200, 100)) {
   JOptionPane.showMessageDialog(null, "Deutschland über alles, Deutschland über alles in der Welt! -First Verse of German National Anthem");
   System.exit(0);//top
  }
}
void mousePressed(){
  birdyvelocity = 10;
  sound.trigger();
  
}
boolean intersects(float birdX, float birdY, float paddleX, float paddleY, float paddleLength) {
if (birdY > paddleY && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}

boolean intersects2(float birdX, float birdY, float paddleX, float paddleY, float paddleLength) {
if (birdY < paddleY && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}