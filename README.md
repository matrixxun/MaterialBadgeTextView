[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MaterialBadgeTextView-brightgreen.svg?style=flat)]()

# MaterialBadgeTextView
As the name describes, This "MaterialBadgeTextView" is an Android library that provides a reformed textview for Badge. A Badge is a colored circle with an inserted number which are displayed at the top-right conner of the icons, it often plays a role of showing new messages or new features in IM apps such as **Facebook Messager, WhatsApp, WeChat**, and forth.

## Features
1. Material Design style - it provides a default shadow like FAB(Floating Action Bar)
2. Easy to use - you can just use it as a normal TextView
3. Really Lite - only ONE java class, no resource file
4. Support MenuAction in Toolbar


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
