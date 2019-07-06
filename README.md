# dagger.obj

dagger.android 只能注入到 Android,Fragment,Service…等类中，但在某些**特殊情况下**我们需要注入到其他类中，但 dagger.android 并不支持，故而有了此库：

参考 Dagger AndroidSupport写法，使得DaggerAndroid 能注入到任何类中

### 原理

说到底，dagger.android 是将所有的实例都提供给了 Application（通过 Provider 实现懒加载），AndroidInjection.inject(this);实际上就是去 Application 去取实例，然后注入到被注入对象中的。

所以，dagger.obj 做的事情就是将 Application 中的实例注入到普通 Object 中，和 dagger.android.support中对 android.support.v4.app.Fragment 的支持类似。

### 使用

和 dagger.android.support 类似，只是使用 AndroidObjInjection.inject(this); 注入就行了。
