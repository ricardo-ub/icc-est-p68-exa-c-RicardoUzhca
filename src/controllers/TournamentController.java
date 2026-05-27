package controllers;

import models.Tournament;

public class TournamentController {
  public void sortSelectionDesc(Tournament[] tournaments){
    for (int i = 0; i < tournaments.length; i++) {
      int indice=i;
      for (int j = i+1; j < tournaments.length; j++) {
        if(tournaments[i].getTotalStarterPoints()<tournaments[indice].getTotalStarterPoints()){
          indice=j;
          j--;
        }
      }
      Tournament aux = tournaments[i];
      tournaments[i] = tournaments[indice];
      tournaments[indice] = aux;
    }

  }

  public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints){
    int bajo = 0;
    int alto = tournaments.length-1;

    while(bajo>=alto){
      int central = (bajo+alto)/2;
      int puntos = totalStarterPoints;

      /*
      if (){
        if(puntos>isStarter){
          bajo=central+1;
          alto=central-1;
        }
      }else{
        if(puntos>isStarter){
          bajo=central+1;
          alto=central-1;
        }
      }
         */
    }
    return null;
  }

}
