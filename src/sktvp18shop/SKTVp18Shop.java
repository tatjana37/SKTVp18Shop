/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp18Shop;

import classes.App;

/**
 *
 * @author User
 */
public class SKTVp18Shop {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      String flag = "base";
      if(args != null){
            flag = args[0];
        }
        App app = new App(flag);
        app.run();
   }
}
