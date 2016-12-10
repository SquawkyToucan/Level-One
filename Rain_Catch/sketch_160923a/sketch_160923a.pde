import ddf.minim.*;
PImage backgroundImage;
Minim minim;            
AudioSample sound;
int   speed = 10;
int  y1Pos = 0;
int x1Pos = 400;
int score = 0;
int winScore = 100;
int counter = 0;
int fill = 0;
PFont font = createFont("Arial", 32);
int multiplier = 1;
void setup(){
  size(1000,700);
  backgroundImage = loadImage("sky.jpg");
  minim = new Minim (this);    
  sound = minim.loadSample("squelch.wav", 128);
  textFont(font, 32);
}
void draw(){
  if(mousePressed) {
   score += fill*multiplier;
   fill = 0; 
  }
  if(score > 0 && score <= 20) {
   multiplier = 1; 
  }
  if(score > 20 && score <= 40) {
   multiplier = 2; 
  }
  if(score > 40 && score <= 60) {
   multiplier = 3; 
  }
  if (score<winScore){
  drawRain();
  drawBucket();
  nearlyThereMessage();
  }
  else {
  endGame();
  }
   writeScore();
}
void drawRain(){
  if (y1Pos > height-100){
  checkCatch(x1Pos);
  x1Pos = (int) random(900)+50;
  y1Pos = 0;
  }
  //background(204,214,215);
  image(backgroundImage, 0, 0);          
  image(backgroundImage, 0, 0, width, height);
  noStroke();
  fill(22,99,233);
  ellipse(x1Pos,y1Pos,20,20);
  y1Pos +=speed+score*15/winScore;
}
void drawBucket(){
  stroke(111,35,7);
  if (fill>=6*20/7)
  fill(22,99,233);
  else
  fill(111,35,7);
  rect(mouseX,600,100,10);
  if (fill>=5*20/7)
  fill(22,99,233);
  else
  fill(111,35,7);
  rect(mouseX,610,100,10);
  if (fill>=4*20/7)
  fill(22,99,233);
  else
  fill(111,35,7);
  rect(mouseX,620,100,10);
  if (fill>=3*20/7)
  fill(22,99,233);
  else
  fill(111,35,7);
  rect(mouseX,630,100,10);
  if (fill>=2*20/7)
  fill(22,99,233);
  else
  fill(111,35,7);
  rect(mouseX,640,100,10);
  if (fill>=20/7)
  fill(22,99,233);
  else
  fill(111,35,7);
  rect(mouseX,650,100,10);
}
void endGame(){
 //background(204,214,215);
  image(backgroundImage, 0, 0);          
  image(backgroundImage, 0, 0, width, height);
  textSize(32);
  fill(22,99,233);
  text("Congratulations! You win!", 400,300); 
}
void writeScore(){
  fill(0,0,0);
  textSize(16);
  text("Score: "+score,900,30);
  textSize(32);
  fill(0, 68, 170);
  text("                  Catch the Rain \n       Click to empty and get points \nBoost your multiplier with more points!", 225,30);
}
void checkCatch(int x){
 if (x > mouseX && x < mouseX+100){
  score++;
  fill++;
  sound.trigger();
 }
 else if (score>0) {
   score--;
   fill--;
 }
}
void nearlyThereMessage(){
  if (fill>winScore*3/4){
      fill(255,0,0);
      textSize(32);
      text("Nearly there!!",400,80);
  }
}

