/* ******************************************************
 * Simulator alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: data/Data.java 2015-03-09 buixuan.
 * ******************************************************/
package data;

import specifications.DataService;

public class Data implements DataService{
  //private Heroes hercules;
  Position heroesPosition;
  int stepNumber;

  public Data(){
    //hercules = new Heroes;
    heroesPosition = new Position(0,0);
    stepNumber = 0;
  }

  @Override
  public Position getHeroesPosition(){ return heroesPosition; }

  @Override
  public int getStepNumber(){ return stepNumber; }

  @Override
  public void setHeroesPosition(Position p) { heroesPosition = p; }
  
  @Override
  public void setStepNumber(int n){ stepNumber=n; }
}
