Gui, Add, Text, x40 y5 w110 h20, ��ũ�� ���α׷�
Gui, Add, Text, x60 y25 w50 h20 vA, �غ�!
Gui, Add, Text, x60 y50 h20 w50 vB, 0 ȸ
Gui, Add, Button, x20 y80 w110 h20, ����
Gui, Add, Button, x20 y110 w110 h20, ����
Gui, show
CoordMode, Mouse, Screen
CoordMode, Pixel, Screen



return

Button����:
{
   Gui,Submit,noHide
   GuiControl, , A, ����

   ���� := true
   Ŭ����Ƚ�� := 0

   Loop
   {
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *50 C:\Users\�׼�\Desktop\����\new2\st2.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}

         Sleep, 1000 
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *50 C:\Users\�׼�\Desktop\����\new2\st1.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
      }
      if (Ŭ����Ƚ�� = 0)
      {
         ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\�׼�\Desktop\����\new2\st4.bmp
         if (ErrorLevel = 0)
         {
            Send {Click %FoundX% %FoundY%}
            Sleep, 1000

         }
         ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\�׼�\Desktop\����\new2\st3.bmp
         if (ErrorLevel = 0)
         {
            Send {Click %FoundX% %FoundY%}
            Sleep, 1000
         }
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\�׼�\Desktop\����\new2\st8.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000

      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\�׼�\Desktop\����\new2\st6.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\�׼�\Desktop\����\new2\st7.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
      }
      ImageSearch, FoundX, FoundY, 0,0, A_ScreenWidth, A_ScreenHeight, *30 C:\Users\�׼�\Desktop\����\new2\st5.bmp
      if (ErrorLevel = 0)
      {
         Send {Click %FoundX% %FoundY%}
         Sleep, 1000 
                    Ŭ����Ƚ�� := Ŭ����Ƚ�� + 1
         Gui,Submit,noHide
         GuiControl, , B, %Ŭ����Ƚ��% ȸ
      }
      if(���� = false)
      {
         break
      }
   } 
}
return

Button����:
{
   ���� := false
   ExitApp
}
return