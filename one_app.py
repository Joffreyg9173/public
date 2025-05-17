from kivymd.app import MDApp
from kivymd.uix.scrollview import MDScrollView
from kivymd.uix.list import OneLineListItem, TwoLineListItem,ThreeLineListItem, MDList
from kivy.lang.builder import Builder
from kivymd.uix.list import OneLineLIstIconListItem


x = '''
ScrollView:
    MDList:
        OneLineListItem:
            text: "Item1"
            IconLeftWidget:
                icon: "android"
'''

class New(MDApp):
    def build(self):
       a = Builder.load_string(x)
       
       return a 
       
New().run()
