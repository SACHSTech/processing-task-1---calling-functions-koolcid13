import processing.core.PApplet;

/**
* A program Sketch.java that sketches a simple drawing including a background, a foreground, and multiple shapes.
* @author: Avin A.
*
*/

public class Sketch extends PApplet {
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(170, 207, 235);
  }

  public void draw() {
    // White Guy
    stroke(255);
    fill(170, 200, 235);
    // white guy head
    ellipse(140, 30, 42, 42);
    // white guy body
    line(137, 50, 120, 104);
    // white guy left bicep
    line(130, 74, 105, 38);
    // white guy left forearm
    line(105, 38, 120, 0);
    // white guy upper leg
    line(120, 104, 150, 145);
    // white guy lower leg
    line(120, 104, 140, 150);
    // white guy left eye
    line(137, 30, 136, 20);
    // white guy right eye
    line(145, 30, 145, 20);
    // white guy left half of smile
    line(140, 44, 130, 33);
    // white guy right half of smile
    line(140, 44, 149, 35);
    // white guy right arm
    line(130, 74, 160, 94);

    // Gray Guy Head System
    stroke(120);
    fill(170, 200, 235);
    // gray guy head
    ellipse(164, 102, 28, 28);
    // gray guy left eye
    line(155, 100, 161, 94);
    line(155, 94, 161, 100);
    // gray guy right eye
    line(166, 100, 172, 94);
    line(166, 94, 172, 100);
    // gray guy mouth
    line(156, 106, 172, 106);

    // Gray Guy Hat
    stroke(219, 15, 155);
    fill(201, 20, 145);
    // hat base
    triangle (151, 87, 177, 87, 164, 57);
    // hat decor
    stroke(20, 201, 83);
    line(153, 82, 173, 78);
    line(158, 70, 169, 67);
    stroke(233, 237, 7);
    line(155, 76, 171, 72);
    // hat star
    stroke (233, 237, 7);
    line(164, 57, 164, 45);
    line(160, 54, 168, 48);
    line(160, 48, 168, 54);

    // Stairs
    stroke(153, 7, 237);
    fill (153, 7, 237);
    rect(200, 370, 160, 30);
    rect(200, 340, 120, 30);
    rect(200, 310, 80, 30);
    rect(200, 280, 40, 30);

    // Gray Guy Lower Body
    stroke(120);
    // gray guy left leg
    line(201, 280, 214, 250);
    // gray guy right leg
    line(227, 280, 214, 250);
    // gray guy body
    line(214, 250, 214, 210);
    // gray guy lower hand
    line(214, 226, 194, 195);
    // gray guy upper hand
    line(214, 224, 198, 186);

    // Ladder
    stroke(115, 57, 25);
    line(350, 0, 320, 115);
    line(326, 0, 296, 115);
    line(300, 94, 325, 92);
    line(305, 74, 330, 72);
    line(310, 54, 335, 52);
    line(315, 34, 340, 32);
    line(320, 14, 345, 12);

    // Blue Guy
    stroke(57, 132, 212);
    // blue guy right leg
    line(280, 115, 272, 95);
    // blue guy left leg
    line(272, 95, 266, 115);
    // blue guy body
    line(272, 95, 272, 70);
    // blue guy left arm
    line(272, 79, 257, 63);
    // blue guy right bicep
    line(272, 79, 280, 85);
    // blue guy right forearm
    line(280, 85, 272, 93);
    // blue guy head
    fill(170, 200, 235);
    ellipse(272, 60, 20, 20);
    // blue guy eyes
    ellipse(269, 57, 1, 1);
    ellipse(275, 57, 1, 1);
    // blue guy smile
    line(272, 65, 266, 60);
    line(272, 65, 278, 60);
  }
}