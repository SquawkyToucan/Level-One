PImage pictureOfRecord;
int angle = 0;
void setup() {
  pictureOfRecord = loadImage("AHAHAHHAHAHA .png");
  size(pictureOfRecord.width, pictureOfRecord.height);
}
void draw() {
  rotateImage(pictureOfRecord, 60);
  image(pictureOfRecord, 0, 0);
  angle++;
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);                              
  translate(-image.width/2, -image.height/2);
}

