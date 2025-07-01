// this is a food catcher game 
var back = createSprite(200,200);

back.setAnimation("cave_1");
var player = createSprite(200,300);
player.setAnimation("baby_robot_1");
player.scale=0.3;
var food = createSprite(200,200);
food.setAnimation("soda_1");
food.scale=0.1;
food.velocityX=7;
var score = 0;
function foodfn() {
  if (food.x>450)
  {
   food.x=-20;
   food.y=randomNumber(10,300);
  }
}
function playerfn() 
{
  if (keyDown("up"))
{
  player.y=player.y-5;
}
  if (keyDown("down"))
{
  player.y=player.y+5;
}  
  if (keyDown("left"))
{
  player.x=player.x-5;
}
  if (keyDown("right"))
{
  player.x=player.x+5;
}
}
function scorefn()
{
   textSize(50);
 stroke("red");
 strokeWeight(3);
 text(score,200,50);
 if (player.isTouching(food))
{
  food.x=-20;
  food.y=randomNumber(50,350);
  score=score+1;
}
}
function newback()
{
  if (score===10) 
  {
   back.setAnimation("desert_1");
   food.setAnimation("juice_box_1");
   playerfn();
   foodfn();
   food.velocityX=9;
   scorefn();
   }
}
function newback2()
{
  if (score===20)
  {
    back.setAnimation("underground_1");
    food.setAnimation("burger_1");
    playerfn();
    foodfn();
    food.velocityX=10;
    scorefn();
  }
}


function end()
{
  if(score===40)
  
  {
    back.setAnimation("bla jpeg.");
    player.destroy();
    food.destroy();
    score.destroy();
  }
}
  
  
function draw()
{
playerfn();
foodfn();
drawSprites();
scorefn();
newback();
newback2();
end();
}
