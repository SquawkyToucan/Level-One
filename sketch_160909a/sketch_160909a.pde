import ddf.minim.*;  
PImage pictureOfRecord;
int angle = 0;
boolean isClicked = false;
Minim minim;   
AudioPlayer song;
void setup() {
  pictureOfRecord = loadImage("AHAHAHHAHAHA .png");
  size(pictureOfRecord.width, pictureOfRecord.height);
  minim = new Minim(this);
  song = minim.loadFile("DJVI - xStep.mp3", 512);
}
void draw() {
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0);
  if(isClicked == true) {
    angle+=10; 
  }
  if(mousePressed) {
    isClicked = true;
    song.play();
  }
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);                              
  translate(-image.width/2, -image.height/2);
}

