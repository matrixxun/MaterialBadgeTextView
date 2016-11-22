[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MaterialBadgeTextView-brightgreen.svg?style=flat)]()

# MaterialBadgeTextView
**`update info`**  
**`11/22/2016: `**Support MenuAction in Toolbar;

As the name describes, this is an Android library that you can use to show new messages badge and new features badge, for example in some IM App such as **WhatsApp, Facebook Messenger, WeicChat**.  
More importantly, it has a default shadow like FAB(Floating Action Button) and it's more simple to use just like ordinary TextView. Only one java Class and no png or xml drawable resource file.

## Why you need this library
1. You know, the **Shadow** & **Elevation** is Material Design core element. So...
2. Like TextView, you didn't need to care about **background shadow, width, height, visible, gone and the limit of numbers**. Just set text, textColor and TextSize in layout xml, or call setBadgeCount(), setHighLightMode() method in source code...


If you use mac OS X, you must have seen this image:
  
<img src="https://github.com/matrixxun/MaterialBadgeTextView/blob/master/MaterialBadgeTextView/art/qq_pic.png" width="600">

## Demo Screen Capture
<img src="https://github.com/matrixxun/MaterialBadgeTextView/blob/master/MaterialBadgeTextView/art/screen_cap.png" width="400">

## Usage
| Code | Badge |
| :----- | :------ | 
| **`setBadgeCount(0,true)`** | the TextView is blank |
| **`setBadgeCount(0,false)`** | ![badge_0](MaterialBadgeTextView/art/badge_0.png) |
| **`setBadgeCount(3)`** | ![number](MaterialBadgeTextView/art/badge_3.png) |
| **`setBadgeCount(68)`** | ![two](MaterialBadgeTextView/art/badge_68.png) |
| **`setBadgeCount(101)`** | ![two](MaterialBadgeTextView/art/badge_99.png) |
| **`setBadgeCount(99999)`** | ![two](MaterialBadgeTextView/art/badge_99.png) |
| **`setHighLightMode()`** | ![two](MaterialBadgeTextView/art/badge_red.png) |
| **`setText("")`** | the TextView is blank |
| **`setText("Hello World!")`** | ![two](MaterialBadgeTextView/art/badge_hello.png) |
| **`setText("10999999976")`** | ![two](MaterialBadgeTextView/art/badge_long.png) |


## Compat
API level 9+ supported

## Example
See example code here on Github. You can also see it live downloading [this apk](https://raw.githubusercontent.com/matrixxun/MaterialBadgeTextView/master/MaterialBadgeTextView/apk/app-debug.apk)

License
--------


    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
