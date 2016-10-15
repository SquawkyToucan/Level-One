//Spawnpoint at the bottom
import javax.swing.JOptionPane;
int frogX = 200;
int frogY = 610;
int hop = 15;
boolean hasStarted = false;
Car truck = new Car(350, 50, 150, 2);
Car minivan = new Car(350, 225, 100, 4);
Car normal = new Car(350, 150, 70, 6);
Car smartcar = new Car(350, 300, 50, 5);
Log one = new Log(450, 2, 170);
Log two = new Log(480, 3, 130);
Log three = new Log(510, 2, 180);
Log four = new Log(540, 3, 150);
Log five = new Log(570, 1, 190);
void setup() {
  size(400, 625);
}
void draw() {
  noStroke();
  background(0,0,0);
  fill(0, 0, 255);
  rect(0, 450, 400, 150); 
  truck.makeCar();
  minivan.makeCar();
  normal.makeCar();
  smartcar.makeCar();
  truck.go();
  minivan.go();
  normal.go();
  smartcar.go();
  one.makeLog();
  one.golog();
  two.makeLog();
  two.golog();
  three.makeLog();
  three.golog();
  four.makeLog();
  four.golog();
  five.makeLog();
  five.golog();
  fill(0, 136, 85);
  ellipse(frogX, frogY, 20, 20);
  if(onLog(one)) {
    frogX = one.getX() + (one.getLength()/2);
  }
  if(intersects(truck)||intersects(minivan)||intersects(normal)||intersects(smartcar)) {
    frogX = 200;
    frogY = 610;
  }
  if((inWater(one)||inWater(two)||inWater(three)||inWater(four)||inWater(five))&&!(onLog(one)||onLog(two)||onLog(three)||onLog(four)||onLog(five))) {
  frogX = 200;
  frogY = 610; 
}
  if(frogY <= 0) {
    fill(random(255), random(255), random(255));
    text("You win!", 150, 50);
    textSize(20);
    JOptionPane.showMessageDialog(null, "You win!");
    System.exit(0);
  }
}
void keyPressed() {
  if(key == CODED) {
   if(keyCode == UP && frogY > 0) {
    frogY = frogY - hop; 
   }
   if(keyCode == DOWN && frogY < 625) {
    frogY = frogY + hop; 
   }
   if(keyCode == RIGHT && frogX < 400) {
    frogX = frogX + hop; 
   }
   if(keyCode == RIGHT && frogX > 400 - hop) {
    frogX = 200;
    frogY = 390;
   }
   if(keyCode == LEFT && frogX > 0) {
    frogX = frogX - hop; 
   }
   if(keyCode == LEFT && frogX < 0 + hop) {
    frogX = 200;
    frogY = 390; 
   }
  }
}
boolean intersects(Car car) {
if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getSize()))
          return true;
    else 
          return false;
}
class Car {
  int toggle = 0;
  //0 = left, 1 = right
  int carX;
  int carY;
  int size;
  int speed;
  Car(int carX, int carY, int size, int speed) {
   this.carX = carX;
   this.carY = carY;
   this.size = size;
   this.speed = speed;
  }
  float r = random(255);
  float g = random(255);
  float b = random(255);
  float car = random(50);
  void makeCar() {
   fill(r, g, b);
   rect(carX, carY, size, 40);  
  }
  void go() {
   if(toggle == 0) {
    goLeft(); 
   }
   if(toggle == 1) {
     goRight();
   }
  }
  void goLeft() {
     carX = carX - speed;
     if(carX <= 0) {
       toggle = 1;
     }
  }
  void goRight() {
     carX = carX + speed;
     if(carX >= 400) {
       toggle = 0;
     }
  }
  int getX() {
   return carX;
  }
  int getY() {
   return carY; 
  }
  int getSize() {
   return size; 
  }
}
class Log {
 int x = 0;
 int y;
 int logspeed;
 int length;
 Log(int y, int logspeed, int length) {
  this.y = y;
  this.logspeed = logspeed;
  this.length = length;
 }
  void makeLog(){
   fill(139, 69, 19);
   rect(x, y, length, 30);
  }
  void golog() {
    x = x + logspeed;
    if(x > 400) {
     x = 0; 
    }
  }
  int getX() {
   return x; 
  }
  int getY() {
   return y; 
  }
  int getSize() {
   return length; 
  }
  int getLength() {
   return length; 
  }
 }
boolean inWater(Log log) {
if ((frogY < 600 && frogY > 450)&& !(frogY > log.getY() && frogY < log.getY()+30) && (frogX > log.getX() && frogX < log.getX()+log.getSize()))
          return true;
    else 
        return false;
}
boolean onLog(Log log) {
 if((frogY > log.getY() && frogY < log.getY()+30)&&(frogX > log.getX() && frogX < log.getX()+log.getSize())){
  return true; 
 }
 else {
  return false; 
 }
}
/*void followLog(Log log) {
 frogX = log.getX + (log.getLength/2);
}
//Basically just follows the log in the middle
*/