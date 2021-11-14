package com.lookenghua.vantforandroid.conf

data class MenuColumn(val title: String, val children: List<MenuItem>)

data class MenuItem(val title: String, val route: String = "/")

val menus = arrayOf(
    MenuColumn(
        "基础组件", listOf(
            MenuItem("Button 按钮","/button"),
            MenuItem("Cell 单元格"),
            MenuItem("Icon 图标"),
            MenuItem("Image 图片"),
            MenuItem("Layout 布局"),
            MenuItem("Popup 弹出层"),
            MenuItem("Style 内置样式"),
            MenuItem("Toast 轻提示"),
        )
    ),
    MenuColumn(
        "表单组件", listOf(
            MenuItem("Calendar 日历"),
            MenuItem("Cascader 级联选择"),
            MenuItem("Checkbox 复选框"),
            MenuItem("DatetimePicker 时间选择"),
            MenuItem("Field 输入框"),
            MenuItem("Form 表单"),
            MenuItem("NumberKeyboard 数字键盘"),
            MenuItem("PasswordInput 密码输入框"),
            MenuItem("Picker 选择器"),
            MenuItem("Radio 单选框"),
            MenuItem("Rate 评分"),
        )
    ),
)