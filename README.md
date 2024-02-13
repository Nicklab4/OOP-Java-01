# Объектно-ориентированное программирование

## 2024.02.12 Домашнее задание №4
Создан класс **LinkedList** наследующий интерфейс **GBList**

Реализованы методы **add(T elem)**, **remove(int index)**, **get(int index)**, **size()**, **toString()**

Не реализован метод **iterator()** - не хватило времени. Дополню его как только будет ещё свободное время.





## 2024.02.10 Домашнее задание №2
Задание приведено в соответствие с расширенным разбором задания на третьем семинаре.


## 2024.02.08 Домашнее задание №3

Добрый день.
Я прошу прощения, но - я не успеваю подготовить домашнее задание к сроку.
Я постараюсь сделать его в самое ближайшее время.


## Домашнее задание №2

Создан класс **Personnel** и наследующие от него **Doctor** и **Nurse**.

В классе **Personnel** определены виртуальные методы: **toString()** и **medicalProcedures()**

В классах **Doctor** и **Nurse** реализации этих методов:
- **toString()** - Возвращает дожность и имя
- **medicalProcedures()** - Сообщает о проделанных процедурах

Созданы интерфейсы **Goable**, **Flyable**, **Swimable**.

У интерфейсов реализованы методы получения скорости заданного действия: **double run()**, **double fly()**, **double swim()**

Добавлены наследники этим интерфейсам, 
- **Cat** реализует **IGoable**
- **Dog** реализует **IGoable**, **ISwimmable**
- **Duck** реализует **IGoable**, **ISwimmable**, **IFlyable**

Создан класс ВетеринарнаяКлиника - **VeterinaryClinic**
- **getPersonnel()** - вывести список медперсонала
- **getAnimals()** - вывести список животных в клинике
- **medicalProcedures()** - действия персонала

В результате выполнения кода   
```
VeterinaryClinic clinic = new VeterinaryClinic();

Animal catty = new clients.Cat("Барсик");
Dog doggie = new clients.Dog("Шарик");
Duck duffy = new clients.Duck("ДаффиДак");

catty.propertyOfAnimal();
duffy.propertyOfAnimal();

List<Animal> animals = new ArrayList<Animal>();
animals.add(doggie);
animals.add(catty);

clinic.setAnimals(animals); // Помещаем в класс клиники список животных
clinic.addAnimal(duffy);    // Добавляем животных по одному

clinic.getAnimals();        // Выводим список животных в клинике
clinic.getPersonnel();      // Выводим список медперсонала клиники

clinic.medicalProcedures(); // Выполняем медпроцедуры клиники
```
будет выведен результат:
```
Кошка бегает со скоростью 10.0 м/с
Утка бегает со скоростью 5.0 м/с
Утка плавает со скоростью 10.0 м/с
Утка летает со скоростью 20.0 м/с
[nameOfAnimal = Шарик, bd = 2024-02-05, owner = clients.Owner@7e6cbb7a, illness = clients.Illness@7c3df479,, nameOfAnimal = Барсик, bd = 2024-02-05, owner = clients.Owner@7106e68e, illness = clients.Illness@7eda2dbb,discount=null}, nameOfAnimal = ДаффиДак, bd = 2024-02-05, owner = clients.Owner@5d099f62, illness = clients.Illness@37f8bb67,]
[Доктор - Антон Павлович Чехов, Медсестра - Амалия Ивановна]
Доктор проверяет сотояние животного Шарик
Доктор проверяет сотояние животного Барсик
Доктор проверяет сотояние животного ДаффиДак
Медсестра делает процедуры животному Шарик
Медсестра делает процедуры животному Барсик
Медсестра делает процедуры животному ДаффиДак

Process finished with exit code 0
```


## Домашнее задание №1

реализованы вспомогательные классы:
**AnimGoing**, **AnimGoingSwiming**, **AnimGoingSwimingFlying**

классы имеют методы определяющее поведение животных:
- AnimGoing - **going**;
- AnimGoingSwiming - **going**, **swiming**;
- AnimGoingSwimingFlying - **going**, **swiming**, **flying**

В классе Animal добавлен метод **propertyOfAnimal**, который переопределяется в каждом из классов **Dоg**, **Cat**, **Duck** и реализует вывод информации о поведении каждого животного

В результате выполнения кода 

```
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(cat);
    animals.add(doggie);
    animals.add(catty);
    animals.add(duffy);

    for (Animal animal : animals )
    {
        System.out.println(animal.getType());

        System.out.println("Свойства животного при помощи методов присущих подклассу");
        //Условие определяющее принадлежность какому либо подклассу
        if(animal instanceof AnimGoing){
        //выполнение действий этого подкласса
            ((AnimGoing)animal).going();
        }

        if(animal instanceof AnimGoingSwiming){
            ((AnimGoingSwiming)animal).going();
            ((AnimGoingSwiming)animal).swiming();
        }

        if(animal instanceof AnimGoingSwimingFlying){
            ((AnimGoingSwimingFlying)animal).going();
            ((AnimGoingSwimingFlying)animal).swiming();
            ((AnimGoingSwimingFlying)animal).flying();
        }

        // Вызов свойств класса при помощи метода переопределённого в каждом подклассе
        System.out.println("Свойства животного при помощи метода propertyOfAnimal()");
        animal.propertyOfAnimal();
    }
```

будет выведен результат:
```
Animal
Свойства животного при помощи методов присущих подклассу
Свойства животного при помощи метода propertyOfAnimal()
Dog
Свойства животного при помощи методов присущих подклассу
животное умеет бегать
животное умеет плавать
Свойства животного при помощи метода propertyOfAnimal()
животное умеет бегать
животное умеет плавать
Cat
Свойства животного при помощи методов присущих подклассу
животное умеет бегать
Свойства животного при помощи метода propertyOfAnimal()
животное умеет бегать
Duck
Свойства животного при помощи методов присущих подклассу
животное умеет ходить
животное умеет плавать
животное умеет летать
Свойства животного при помощи метода propertyOfAnimal()
животное умеет ходить
животное умеет плавать
животное умеет летать

Process finished with exit code 0
```
