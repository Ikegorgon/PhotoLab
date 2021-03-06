package pixLab.classes;
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
  public static void testGlitchArt() {
	  Picture sample = new Picture("gorge.jpg");
	  sample.explore();
	  sample.glitchArt();
	  sample.explore();
  }
  public static void testClassFilter() {
	  Picture sample = new Picture("gorge.jpg");
	  sample.explore();
	  sample.classFilter();
	  sample.explore();
  }
  public static void testRand() {
	  Picture sample = new Picture("beach.jpg");
	  sample.explore();
	  sample.randFilter(sample.getHeight()/2, sample.getWidth()/2);
	  sample.explore();
  }
  public static void testColorEnhance() {
	  Picture sample = new Picture("beach.jpg");
	  sample.explore();
	  sample.colorEnhance();
	  sample.explore();
	  Picture sample1 = new Picture("redMotorcycle.jpg");
	  sample1.explore();
	  sample1.colorEnhance();
	  sample1.explore();
	  Picture sample2 = new Picture("moon-surface.jpg");
	  sample2.explore();
	  sample2.colorEnhance();
	  sample2.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
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
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
//    testMirrorVertical();
//    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
//    testCollage();
    //testCopy();
//    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
//	  testRand();
//	  testColorEnhance();
//	  testGlitchArt();
	  testClassFilter();
  }
}