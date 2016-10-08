//Spawnpoint at the bottom
int frogX = 200;
int frogY = 390;
int hop = 15;
boolean hasStarted = false;
Car truck = new Car(350, 50, 150, 2);
Car minivan = new Car(350, 225, 100, 4);
Car normal = new Car(350, 150, 70, 6);
Car smartcar = new Car(350, 300, 50, 5);
void setup() {
  size(400, 400);
}
void draw() {
  background(0,0,0);
  fill(0, 136, 85);
  ellipse(frogX, frogY, 20, 20);
  truck.makeCar();
  minivan.makeCar();
  normal.makeCar();
  smartcar.makeCar();
  truck.go();
  minivan.go();
  normal.go();
  smartcar.go();
  if(intersects(truck)||intersects(minivan)||intersects(normal)||intersects(smartcar)) {
    frogX = 200;
    frogY = 390;
  }
  if(frogY <= 0) {
    fill(random(255), random(255), random(255));
    text("You win!", 150, 50);
    textSize(20);
  }
}
void keyPressed() {
  if(key == CODED) {
   if(keyCode == UP && frogY > 0) {
    frogY = frogY - hop; 
   }
   if(keyCode == DOWN && frogY < 400) {
    frogY = frogY + hop; 
   }
   if(keyCode == RIGHT && frogX < 400) {
    frogX = frogX + hop; 
   }
   if(keyCode == LEFT && frogX > 0) {
    frogX = frogX - hop; 
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