# Объектно-ориентированное программирование


## 2024.02.15 Домашнее задание №4
Дополнено реализацией метода **iterator()**
```
@Override
    public void add(T elem) {
        Node<T> first = head;       // Создаём первый узел и помещаем в него головной элемент
                                    // Создаём второй узел взаимосвязанный с первым
        Node<T> newNode = new Node<T>(null, elem , head);
        head = newNode;             //
        if (first == null)
            tail = newNode;
        else first.previous= newNode;
        size++;
    }

    @Override
    public void remove(int index) {             // Удаление элемента по индексу
        Node<T> node = tail;

        if (index+1 == size){                   // Решение для случая когда индекс элемента максимальный,
            node.previous.next = node.next;     // то-есть для крайнего правого элемента
        }

        else if (index == 0){                   // Решение для случая когда индекс равен нулю
            node = node.previous;               // то-есть для крайнего левого элемента
            node.next = null;
            tail = node;
        }

        else {                                  // Решение для случая когда индекс находится между
            while(index > 0 ){                  // левыми и правыми элементами, то есть больше ноля
                node = node.previous;           // и меньше максимального элемента
                index--;
            }

            node.next.previous = node.previous;
            node.previous.next = node.next;
        }

        size--;                                 // Уменьшение размера LinkedList после удаления элемента
    }

    @Override
    public T get(int index) {
        Node<T> node = tail;
        while(index-1 >= 0 ){
            node = node.previous;
            index--;
        }
        return node.value;
    }

    @Override                                // Реализацию скопировал из видео.
    public Iterator<T> iterator() {          // Оказалось всё достаточно тривиально.
        return new Iterator<T>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                return get(count++);
            }
        };
    }
```


Результат выполнения программы:
```
Количество эллементов - 4
Список всех элементов - [10, 20, 30, 40]
Значение элемента по индексу 1 - 20
Список всех элементов после удаления элемента с индексом 1: 
[10, 30, 40]
Проход циклом For, реализация итератора:
10
30
40
```

## 2024.02.15 Домашнее задание №3
Выполнено домашнее задание №3. Оно основано на примере который разбирался на занятии №4.

Единственное измеение которое было внесено - изменён способ подсчёта силы лекарства:
- Вода, при подсчёте силы лекарства, учитывается только одни раз.
- При подсчёте массы, как и в разобранном примере, учитывается вес всех компонентов.

Результат выполнения программы:
```
Список препаратов: 
[Pharm Preparat{fullPower=20, fullWeight=3}, Pharm Preparat{fullPower=15, fullWeight=12}, Pharm Preparat{fullPower=7, fullWeight=11}, Pharm Preparat{fullPower=7, fullWeight=41}]
Список препаратов отсортированный по силе: 
[Pharm Preparat{fullPower=7, fullWeight=11}, Pharm Preparat{fullPower=7, fullWeight=41}, Pharm Preparat{fullPower=15, fullWeight=12}, Pharm Preparat{fullPower=20, fullWeight=3}]
Список препаратов отсоритрованный по массе: 
[Pharm Preparat{fullPower=20, fullWeight=3}, Pharm Preparat{fullPower=7, fullWeight=11}, Pharm Preparat{fullPower=15, fullWeight=12}, Pharm Preparat{fullPower=7, fullWeight=41}]
```

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
