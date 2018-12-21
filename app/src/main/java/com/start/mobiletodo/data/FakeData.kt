package com.start.mobiletodo.data

import com.start.mobiletodo.model.Note

class FakeData {

    fun getNotes(): ArrayList<Note>{
        var list = ArrayList<Note>()
        list.add(Note("Первая запись", "Ко́тлин (фин. Retusaari, Ретусаари, швед. Reitskär, Рейтшер, в грамотах и русских летописях также Рычард) — остров в Финском заливе Балтийского моря, в 30 км западнее центра Санкт-Петербурга. Длина острова — около 12 км, максимальная ширина менее 3 км, площадь около 16 кв. км[1]. Остров соединён с материковой частью автодорогой, проходящей по комплексу защитных сооружений от наводнений. В восточной части острова располагается город Кронштадт. Через весь остров с востока на запад проходит Кронштадтское шоссе.",1))
        list.add(Note("Вторая запись", "Kotlin (Ко́тлин) — это статически типизированный язык программирования, работающий поверх JVM и разрабатываемый компанией JetBrains. Компилируется в JavaScript, а также на другие платформы через инфраструктуру LLVM. Язык назван в честь острова Котлин в Финском заливе, на котором расположен город Кронштадт[3].",2))
        list.add(Note("Третья запись", "Авторы ставили целью создать язык более лаконичный и типобезопасный, чем Java, и более простой, чем Scala[3]. Следствием упрощения по сравнению со Scala стали также более быстрая компиляция и лучшая поддержка языка в IDE[4].",3))
        list.add(Note("Четвертая запись", "Язык разрабатывается с 2010 года, представлен общественности в июле 2011[2]. Исходный код реализации языка открыт в феврале 2012[5]. В феврале выпущен milestone 1, включающий плагин для IDEA. В июне — milestone 2 с поддержкой Android[6]. В декабре 2012 года вышел milestone 4, включающий, в частности, поддержку Java 7",4))
        list.add(Note("Пятая запись", "В феврале 2016 года вышел официальный релиз-кандидат версии 1.0[8], а 15 февраля 2016 года — релиз 1.0[9]. 1 марта 2017 вышел релиз 1.1[10].\n" +
                "\n" +
                "В мае 2017 года компания Google сообщила, что инструменты языка Kotlin, основанные на JetBrains IDE, будут по стандарту включены в Android Studio 3.0 — официальный инструмент разработки для ОС Android[11].",5))
        list.add(Note("Шестая запись", "Позиционируется разработчиками как объектно-ориентированный язык промышленного[уточнить] уровня, а также как язык, который сможет заменить Java. При этом язык полностью совместим с Java, что позволяет разработчикам постепенно перейти с Java на Kotlin. В частности, в Android язык встраивается с помощью Gradle, что позволяет для существующего Android-приложения внедрять новые функции на Kotlin без переписывания приложения целиком.",6))
        list.add(Note("Седьмая запись", "Синтаксис языка похож на Pascal, TypeScript, Haxe, PL/SQL, F#, Go и Scala, C++, Java, C#, Rust и D. При объявлении переменных и параметров типы данных указываются после названия (разделитель — двоеточие). Точка с запятой как разделитель операторов так же необязательна, как в Scala и Groovy; в большинстве случаев перевода строки достаточно, чтобы компилятор понял, что выражение закончилось. Кроме объектно-ориентированного подхода, Kotlin также поддерживает процедурный стиль с использованием функций. Как и в языках C/C++/D, точка входа в программу — функция \"main\", принимающая массив параметров командной строки. Программы на Kotlin также поддерживают Perl- и Unix/Linux shell-стиль интерполяции строк (переменные, включенные в строку заменяются на их содержимое). Kotlin также поддерживает вывод типов.",7))
        return list
    }
}