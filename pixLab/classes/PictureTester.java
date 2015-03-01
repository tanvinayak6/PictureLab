/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testMirrorArms(){
    Picture snow= new Picture("snowman.jpg");
    snow.explore();
    snow.mirrorArms();
    snow.explore();
  }
  public static void testGrayscale()
  {
    Picture lol = new Picture("toilets.jpg");
    lol.explore();
    lol.grayscale();
    lol.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture lol = new Picture("lol.jpg");
    lol.explore();
    lol.keepOnlyBlue();
    lol.explore();
  }
  public static void testNegate(){
    Picture lol = new Picture("cutesies.jpg");
    lol.explore();
    lol.negate();
    lol.explore();
  }
  public static void testMyCollage()
  {
    Picture a = new Picture("lol.jpg");
    Picture b = new Picture("kanvi.jpg");
    Picture c = new Picture("daft connor.jpg");
    a.myCollage(a, b, c);
    a.explore();
  }
  public static void testEdgeDetection()
  {
    Picture lol = new Picture("daft connor.jpg");
    lol.explore();
    lol.edgeDetection(100);
    lol.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("tanvi.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture lol = new Picture("tanvi.jpg");
    lol.explore();
    lol.mirrorVerticalRightToLeft();
    lol.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testFixUnderWater()
  {
    Picture fish = new Picture("water.jpg");
    fish.explore();
    fish.fixUnderWater();
    fish.explore();
  }
  /** Method to test edgeDetection */
  public static void testBlack()
  {
    Picture swan = new Picture("lol.jpg");
    swan.explore();
    swan.changeBlack();
    swan.explore();
  }
  
  public static void testCopy(){
    Picture lol = new Picture("lol.jpg");
    Picture blue = new Picture("blue-mark.jpg");
    lol.copy(blue, 256,262 , 308, 356, 248, 196);
    lol.explore();
  }
  public static void testGull(){
    Picture gull= new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  public static void testHorizontalBotToTop()
  {
    Picture cool = new Picture ("elsa and tanvi.jpg");
    cool.explore();
    cool.mirrorHorizontalBotToTop();
    cool.explore();
  }
  public static void testDress()
  {
    Picture dress = new Picture("dress.jpg");
    dress.explore();
  }
  public static void testHorizontal()
  {
    Picture hats = new Picture("fam.jpg");
    hats.explore();
    hats.mirrorHorizontal();
    hats.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
     //to run
    //testZeroBlue();
   // testKeepOnlyBlue();
   
   
    /*testKeepOnlyRed();
    testKeepOnlyGreen();
    
    
    testMirrorVerticalRightToLeft();
    //testBlack();
    //testHorizontal();
    //testHorizontalBotToTop();
    //testFixUnderWater();
    
    //testMirrorVertical();
    
    */
    //testMirrorTemple();
   //testGrayscale(); 
    //testMirrorArms();
    //testGull();
    //testCopy();
   // testDress();
    /*
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testCopy();
    */
    
     testMyCollage();
     /*
    testEdgeDetection2();
    testChromakey();
    testEncodeAndDecode();
    testGetCountRedOverValue(250);
    testSetRedToHalfValueInTopHalf();
    testClearBlueOverValue(200);
    testGetAverageForColumn(0);
    
    */
   // testNegate();
  }
}
