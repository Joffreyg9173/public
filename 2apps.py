from kivymd.app import MDApp
from kivymd.uix.button import MDFlatButton, MDRaisedButton
from kivymd.uix.screen import Screen
from kivymd.uix.dialog import MDDialog
from kivymd.uix.list import OneLineListItem, TwoLineListItem,ThreeLineListItem, MDList
from kivymd.uix.scrollview import MDScrollView

class Hello(MDApp):
    def build(self):
        screen = Screen()
        close_button = MDRaisedButton(text = "got you", on_press = self.close_dialog)
        fuck_button = MDFlatButton(text = "why?", on_press = self.button)
        self.dialog = MDDialog(
            title = "WARNING",
            text = "this laptop was crashed because of unknown programm\n:(", 
            buttons = [close_button, fuck_button]
        )
        self.dialog.open()
        return screen
    
    def close_dialog(self, obj):
        self.dialog.dismiss()
        
    def button (self, obj):
        screen = Screen
        close_button = MDRaisedButton(text = "got", on_press = self.close_dialog)
        self.dialog = MDDialog(
            title = "cause",
            text = "sorry, but we will not say reason\n:)",
            buttons = [close_button]
        )
        self.dialog.open()
        return screen
    
Hello().run()

        
# IT IS NEW APP
        
class New(MDApp):
    def build(self):
        myscroll = MDScrollView()
        mylist = MDList()
        item1 = ThreeLineListItem(text = "Uzbekistan", secondary_text = "Samarkand", tertiary_text = "City")
        
        myscroll.add_widget(mylist)
        mylist.add_widget(item1)
        
        return myscroll
    
