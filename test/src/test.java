Gui, Add, Text, x40 y5 w110 h20, 매크로 프로그램
Gui, Add, Text, x60 y25 w50 h20 vA, 준비!
Gui, Add, Text, x60 y50 h20 w50 vB, 0 회
Gui, Add, Button, x20 y80 w110 h20, 시작
Gui, Add, Button, x20 y110 w110 h20, 종료
Gui, show
CoordMode, Mouse, Screen
CoordMode, Pixel, Screen



return

Button시작:
{
   Gui,Submit,noHide
   GuiControl, , A, 시작

   시작 := true
   클리어횟수 := 0

   Loop
   {
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *50 C:\Users\항섭\Desktop\게임\new2\st2.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}

         Sleep, 1000 
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *50 C:\Users\항섭\Desktop\게임\new2\st1.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
      }
      if (클리어횟수 = 0)
      {
         ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\항섭\Desktop\게임\new2\st4.bmp
         if (ErrorLevel = 0)
         {
            Send {Click %FoundX% %FoundY%}
            Sleep, 1000

         }
         ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\항섭\Desktop\게임\new2\st3.bmp
         if (ErrorLevel = 0)
         {
            Send {Click %FoundX% %FoundY%}
            Sleep, 1000
         }
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\항섭\Desktop\게임\new2\st8.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000

      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\항섭\Desktop\게임\new2\st6.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\항섭\Desktop\게임\new2\st7.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\항섭\Desktop\게임\new2\st5.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
                    클리어횟수 := 클리어횟수 + 1
         Gui,Submit,noHide
         GuiControl, , B, %클리어횟수% 회
      }
      if(시작 = false)
      {
         break
      }
   } 
}
return

Button종료:
{
   시작 := false
   ExitApp
}
return