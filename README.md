# Объектно-ориентированное программирование

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
