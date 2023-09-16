import javax.swing.JFrame;
/*This class does geometric stuff in a JFrame */
public class GeometricFrame extends JFrame{
  
  /* Transpose the height and width of the JFrame.
   */
  public void transpose(){
    int h = this.getHeight();
    int w = this.getWidth();
    this.setSize(h, w);
  }
  
  /* Scale the window size by a scaling factor 
   * @param double scale factor*/
  public void scale(double factor){
    //get the height and multiply it with facotr
    int newHeight = (int)(this.getHeight()*factor);
    //get the width and multiply it with factor
    int newWidth = (int)(this.getWidth()*factor);
    //set the size
    this.setSize(newWidth, newHeight);
    
    // this.setSize((int)(this.getWidth()*factor), (int)(this.getHeight()*factor));
  }
  
  /* Return true if this window has the same area as the input window
   * @param GeometricFrame to compare
   * @return true if both has the same area */
  public boolean isEqual(GeometricFrame window){
    int windowArea = window.getHeight()*window.getWidth();
    int myArea = this.getHeight()*this.getWidth();
    return myArea == windowArea;
  }
  
  @Override
   /* Change the setSize method to have it also change the size displayed
   * on the title */
  public void setSize(int height, int width){
    super.setSize(width,height);
  }
   
}