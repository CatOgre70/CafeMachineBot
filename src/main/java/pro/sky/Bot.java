package pro.sky;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ArrayList;
import java.util.List;


public class Bot extends TelegramLongPollingBot {

    private long chat_id;

    public static void main(String[] args) {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Bot online!");
        System.out.println("You can use it now.");

    }

    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {

            Message msg = update.getMessage();
            String txt = msg.getText();
            chat_id = msg.getChatId();


            if (txt.equals("/start") || txt.equals("Hi") || txt.equals("Hello") || txt.equals("hello") || txt.equals("hi") || txt.equals("ayup")) {
                sndMessage(chat_id, "Hi, user! My name is CaféMachine. I'm a bot, actually a gaming and a music bot, but I also have other options. My author is Rotaru Vladislav aka ASHE.");
                sndMessage(chat_id, "Type 'Menu' to get the main menu");


            }

            if (txt.equals("How are you doing ?") || txt.equals("how are you doing ?") || txt.equals("How are you doing?") || txt.equals("how are you doing?") || txt.equals("How are you ?") || txt.equals("How are you?") || txt.equals("how are you ?")) {
                sndMessage(chat_id, "I'm good, you ?");

            }
            if (txt.equals("I'm fine") || txt.equals("I'm good") || txt.equals("Im good") || txt.equals("Good")) {
                sndMessage(chat_id, "I'm glad to hear that!");
            }
            if (txt.equals("pic1") || txt.equals("Picture1") || txt.equals("Picture 1") || txt.equals("Pic 1") || txt.equals("pic 1") || txt.equals("Image 1")) {
                sndPhoto(chat_id);
            }
            if (txt.equals("pic2") || txt.equals("Picture2") || txt.equals("Picture 2") || txt.equals("Pic 2") || txt.equals("pic 2") || txt.equals("Image 2")) {
                sndPhoto02(chat_id);
            }
            if (txt.equals("pic3") || txt.equals("Picture3") || txt.equals("Picture 3") || txt.equals("Pic 3") || txt.equals("pic 3") || txt.equals("Image 3")) {
                sndPhoto03(chat_id);
            }
            if (txt.equals("pic4") || txt.equals("Picture4") || txt.equals("Picture 4") || txt.equals("Pic 4") || txt.equals("pic 4") || txt.equals("Image 4")) {
                sndPhoto04(chat_id);
            }
            if (txt.equals("pic5") || txt.equals("Picture5") || txt.equals("Picture 5") || txt.equals("Pic 5") || txt.equals("pic 5") || txt.equals("Image 5")) {
                sndPhoto05(chat_id);
            }
            if (txt.equals("pic6") || txt.equals("Picture6") || txt.equals("Picture 6") || txt.equals("Pic 6") || txt.equals("pic 6") || txt.equals("Image 6")) {
                sndPhoto06(chat_id);
            }

            if (txt.equals("Menu Music")) {
                try {
                    execute(sndInLine8(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

            if (txt.equals("Profile picture") || txt.equals("profile picture") || txt.equals("pfp") || txt.equals("Profile Picture") || txt.equals("profile pic") || txt.equals("Profile pic") || txt.equals("Bot Picture") || txt.equals("Bot pic") || txt.equals("bot pfp")) {
                sndPhotopfp(chat_id);
            }


            if (txt.equals("/test") || txt.equals("Menu") || txt.equals("menu") || txt.equals("/Menu") || txt.equals("/menu")) {
                try {
                    execute(sndInLine(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (txt.equals("Menu coffee") || txt.equals("Menu C") || txt.equals("menu coffee")) {
                try {
                    execute(sndInLine2(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (txt.equals("thanks") || txt.equals("thx") || txt.equals("ty") || txt.equals("Thanks") || txt.equals("tysm") || txt.equals("Thank you") || txt.equals("Thank you ! You too!")) {
                sndMessage(chat_id, "\uD83D\uDC4D");
            }
            if (txt.equals("Description")) {
                sndMessage(chat_id, "This is CaféMachine. He will take your order immediately (I mean.. there are no orders because they are not real). It has 7 menus and one of them is the lobby or the hub for the other menus.");
            }


        }

        if (update.hasCallbackQuery()) {
            if (update.getCallbackQuery().getData().equals("1")) {
                sndPhoto2(chat_id);
                sndMessage(chat_id, "Black Coffee:");
                sndMessage(chat_id, "Cost - 2$");
                sndMessage(chat_id, "Time till it's made - 5-8 min");
                try {
                    execute(sndInLine3(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }


            }
            if (update.getCallbackQuery().getData().equals("101")) {
                sndMessage(chat_id, "Wait here 10 min for your order.");
                sndMessage(chat_id, "10 min later...");
                sndMessage(chat_id, "Here you go! Have a nice day!");
            }
            if (update.getCallbackQuery().getData().equals("102")) {
                sndMessage(chat_id, "Take a seat. The order will be ready in 10 min.");
                sndMessage(chat_id, "10 min later...");
                sndMessage(chat_id, "Here you go!");
            }
            if (update.getCallbackQuery().getData().equals("103")) {
                sndMessage(chat_id, "Take a seat. The command will be ready soon");

                sndMessage(chat_id, "Here you go!");
            }
            if (update.getCallbackQuery().getData().equals("104")) {
                sndMessage(chat_id, " The order will be ready soon");

                sndMessage(chat_id, "Here you go! Have a nice day!");
            }
            if (update.getCallbackQuery().getData().equals("151")) {
                sndMessage(chat_id, "Take a seat. The drink will be ready soon");

                sndMessage(chat_id, "Here you go!");
            }
            if (update.getCallbackQuery().getData().equals("152")) {
                sndMessage(chat_id, " The drink will be ready soon");

                sndMessage(chat_id, "Here you go! Have a nice day!");
            }

            if (update.getCallbackQuery().getData().equals("a")) {
                try {
                    execute(sndInLine2(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("2")) {
                sndPhoto3(chat_id);
                sndMessage(chat_id, "Latte:");
                sndMessage(chat_id, "Cost - 4.46$");
                sndMessage(chat_id, "Time till it's done - 10min");
                try {
                    execute(sndInLine3(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("3")) {
                sndPhoto4(chat_id);
                sndMessage(chat_id, "Cappuccino");
                sndMessage(chat_id, "Cost - 4$");
                sndMessage(chat_id, "Time till it's done - 10min");
                try {
                    execute(sndInLine3(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("4")) {
                sndPhoto5(chat_id);
                sndMessage(chat_id, "Americano");
                sndMessage(chat_id, "Cost - 6$");
                sndMessage(chat_id, "Time till it's done - 8min");
                try {
                    execute(sndInLine3(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("5")) {
                sndPhoto6(chat_id);
                sndMessage(chat_id, "Iced Coffee");
                sndMessage(chat_id, "Cost - 3.50$");
                sndMessage(chat_id, "Time till it's done - 12min");
                try {
                    execute(sndInLine3(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (update.getCallbackQuery().getData().equals("6")) {
                sndPhoto7(chat_id);
                sndMessage(chat_id, "Espresso");
                sndMessage(chat_id, "Cost - 4.50$");
                sndMessage(chat_id, "Time till it's done - 10min");
                try {
                    execute(sndInLine3(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("b")) {
                try {
                    execute(sndInLine4(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("50")) {

                sndPhoto10(chat_id);
                sndMessage(chat_id, "Apple Pie:");
                sndMessage(chat_id, "Cost - 5$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("51")) {
                sndPhoto11(chat_id);
                sndMessage(chat_id, "Blackberry Pie:");
                sndMessage(chat_id, "Cost - 5$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("52")) {

                sndPhoto12(chat_id);
                sndMessage(chat_id, "Cheesecake:");
                sndMessage(chat_id, "Cost - 5$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("53")) {

                sndPhoto13(chat_id);
                sndMessage(chat_id, "Cupcake:");
                sndMessage(chat_id, "Cost - 2$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("54")) {

                sndPhoto14(chat_id);
                sndMessage(chat_id, "Cookies(15)");
                sndMessage(chat_id, "Cost - 2.50$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("55")) {

                sndPhoto15(chat_id);
                sndMessage(chat_id, "Ice Cream");
                sndMessage(chat_id, "Cost - 1$(per ball)");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("d")) {


                try {
                    execute(sndInLine6(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("201")) {

                sndPhoto81(chat_id);
                sndMessage(chat_id, "Apples:");
                sndMessage(chat_id, "Cost - 1.50$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("202")) {

                sndPhoto82(chat_id);
                sndMessage(chat_id, "Bananas:");
                sndMessage(chat_id, "Cost - 2$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("203")) {

                sndPhoto83(chat_id);
                sndMessage(chat_id, "Fruit Salad:");
                sndMessage(chat_id, "Cost - 4$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("204")) {

                sndPhoto84(chat_id);
                sndMessage(chat_id, "Fruit Fest;");
                sndMessage(chat_id, "Cost - 5$");
                try {
                    execute(sndInLine5(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("e")) {

                try {
                    execute(sndInLine7(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("f")) {


                try {
                    execute(sndInLine8(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("h")) {


                try {
                    execute(sndInLine9(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

            if (update.getCallbackQuery().getData().equals("cip")) {


                try {
                    execute(sndInLine11(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("Pic1")) {
                sndPhoto(chat_id);
            }
            if (update.getCallbackQuery().getData().equals("Pic2")) {
                sndPhoto02(chat_id);
            }
            if (update.getCallbackQuery().getData().equals("Pic3")) {
                sndPhoto03(chat_id);
            }
            if (update.getCallbackQuery().getData().equals("Pic4")) {
                sndPhoto04(chat_id);
            }
            if (update.getCallbackQuery().getData().equals("Pic5")) {
                sndPhoto05(chat_id);
            }
            if (update.getCallbackQuery().getData().equals("Pic6")) {
                sndPhoto06(chat_id);
            }


            if (update.getCallbackQuery().getData().equals("jokes")) {


                try {
                    execute(sndInLine12(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("joke1")) {
                sndMessage(chat_id, "The Law of coffee: If you sit down to enjoy a hot cup of coffee, then your boss will ask you to do something that will last until the coffee is cold.");
            }
            if (update.getCallbackQuery().getData().equals("joke2")) {
                sndMessage(chat_id, "Barista: How do you take your coffee? ");
                sndMessage(chat_id, "Me: Very, very seriously.\n");
            }
            if (update.getCallbackQuery().getData().equals("joke3")) {
                sndMessage(chat_id, "UP ALL NIGHT TO GET MORE COFFEE: \n" +
                        "Sleep is a weak substitute for coffee.");
            }
            if (update.getCallbackQuery().getData().equals("joke4")) {
                sndMessage(chat_id, "Q: What's it called when you steal someone's coffee?");
                sndMessage(chat_id, "A: Mugging!");
            }
            if (update.getCallbackQuery().getData().equals("joke5")) {
                sndMessage(chat_id, "Q: Why are Italians so good at making coffee?");
                sndMessage(chat_id, "A: Because they know how to espresso themselves.");
            }
            if (update.getCallbackQuery().getData().equals("joke6")) {
                sndMessage(chat_id, "Q: What's the best Beatles song?");
                sndMessage(chat_id, "A: Latte Be!");
            }

            if (update.getCallbackQuery().getData().equals("501")) {

                sndMessage(chat_id, "Water:");
                sndMessage(chat_id, "Cost - 0.50$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("502")) {

                sndMessage(chat_id, "Tea:");
                sndMessage(chat_id, "Cost - 2$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("503")) {

                sndMessage(chat_id, "Ice Tea:");
                sndMessage(chat_id, "Cost - 2.50$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (update.getCallbackQuery().getData().equals("504")) {

                sndMessage(chat_id, "Cocktail(alcohol):");
                sndMessage(chat_id, "Cost - 5$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("505")) {

                sndMessage(chat_id, "Cocktail(no alcohol):");
                sndMessage(chat_id, "Cost - 3$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("506")) {

                sndMessage(chat_id, "Coca-Cola:");
                sndMessage(chat_id, "Cost - 3.50$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("507")) {

                sndMessage(chat_id, "Fanta:");
                sndMessage(chat_id, "Cost - 3.50$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getCallbackQuery().getData().equals("508")) {

                sndMessage(chat_id, "Sprite:");
                sndMessage(chat_id, "Cost - 3.50$");
                try {
                    execute(sndInLine10(chat_id));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private void sndMessage(long chat_id, String text) {
        SendMessage sm = new SendMessage();
        sm.setChatId(chat_id);
        sm.setText(text);
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1616035596458-2338800a1ff2?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y29mZmVlJTIwbWFjaGluZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto2(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1521302080334-4bebac2763a6?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBjb2ZmZWV8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto3(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1571265391438-3c65bb109b98?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGxhdHRlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto4(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1602320574582-741740d4fcd7?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y2FwcHVjY2lub3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto5(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1514432324607-a09d9b4aefdd?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8YW1lcmljYW5vfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto6(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1579888071069-c107a6f79d82?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8aWNlZCUyMGNvZmZlZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto7(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1579992357154-faf4bde95b3d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZXNwcmVzc298ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private void sndPhotopfp(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://i.ibb.co/0G1QNWm/Caf.png");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private void sndPhoto10(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1572383672419-ab35444a6934?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YXBwbGUlMjBwaWV8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto11(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://icon2.cleanpng.com/20180301/xde/kisspng-muffin-chocolate-cake-apple-pie-blueberry-pie-bake-blueberry-biscuits-5a9808bc4cddc5.5430933315199131483149.jpg");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto12(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1524351199678-941a58a3df50?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Y2hlZXNlY2FrZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto13(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1587668178277-295251f900ce?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8Y3VwY2FrZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto14(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1554175231-8367073ba4e3?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGNvb2tpZXN8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto15(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1557142046-c704a3adf364?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGljZSUyMGNyZWFtfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private void sndPhoto81(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1608000556403-60bfbc40c911?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGFwcGxlc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto82(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1615196753743-f7f8f548fb5d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8YmFuYW5hcyUyMGluJTIwYSUyMGJvd2x8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto83(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1599345570681-9d0f97335b8e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGZydWl0JTIwc2FsYWR8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto84(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);

        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1490474418585-ba9bad8fd0ea?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8ZnJ1aXQlMjBzYWxhZHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);

        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private void sndPhoto02(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);
        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1509042239860-f550ce710b93?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8Y29mZmVlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);
        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto03(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);
        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1501747315-124a0eaca060?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8Y29mZmVlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);
        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto04(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);
        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1447933601403-0c6688de566e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8Y29mZmVlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);
        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto05(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);
        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1507133750040-4a8f57021571?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGNvZmZlZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);
        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sndPhoto06(long chat_id) {
        SendPhoto sp = new SendPhoto();
        sp.setChatId(chat_id);
        InputFile inputFile = new InputFile("https://images.unsplash.com/photo-1527596428171-7885b82c91c6?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGNvZmZlZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        sp.setPhoto(inputFile);
        try {
            execute(sp);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public static SendMessage sndInLine(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();

        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Menu Coffee").callbackData("a").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Deserts").callbackData("b").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Fruits").callbackData("d").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Games").callbackData("e").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Music").callbackData("f").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Other Drinks").callbackData("h").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Pictures").callbackData("cip").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Jokes").callbackData("jokes").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setText("Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        msg.setChatId(chat_id);
        return msg;
    }

    public static SendMessage sndInLine2(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Black Coffee").callbackData("1").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Latte").callbackData("2").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Cappuccino").callbackData("3").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Americano").callbackData("4").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Iced Coffee").callbackData("5").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Espresso").callbackData("6").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Menu Coffee");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine3(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Takeaway").callbackData("101").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("In Restaurant").callbackData("102").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setText("Takeaway or in Restaurant ?");
        msg.setChatId(chat_id);
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine5(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Takeaway").callbackData("104").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("In Restaurant").callbackData("103").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setText("Takeaway or in Restaurant ?");
        msg.setChatId(chat_id);
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine4(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Apple Pie").callbackData("50").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Blackberry Pie").callbackData("51").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Cheesecake").callbackData("52").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Cupcake").callbackData("53").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Cookies").callbackData("54").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Ice Cream").callbackData("55").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Deserts Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine6(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Apples(5)").callbackData("201").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Bananas(6)").callbackData("202").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Fruit Salad").callbackData("203").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Fruit Fest").callbackData("204").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Fruits Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine7(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("TicTacToe").callbackData("301").url("https://playtictactoe.org/").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Chess").callbackData("302").url("https://www.chess.com/").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Snake").callbackData("303").url("https://playsnake.org/").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("PacMan").callbackData("304").url("https://www.google.com/logos/2010/pacman10-i.html").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Roblox").callbackData("304").url("https://www.roblox.com/home").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Games Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine8(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Jazz(BGM)").callbackData("3014444").url("https://open.spotify.com/artist/3yKoHgjtyenCOIRaD2Gghu").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Rap(Eminem)").callbackData("302444444444").url("https://open.spotify.com/artist/7dGJo4pcD2V6oG8kP0tJRR").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Tristam").callbackData("3034444444444444").url("https://open.spotify.com/artist/28Ky95tmlHktB96DBUoB0g").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Tim - The Little Music Fox").callbackData("30444444444444444444").url("https://open.spotify.com/artist/5jIqhL88tLb78gkbB1hvit").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Pop").callbackData("304444444444").url("https://open.spotify.com/playlist/37i9dQZF1DWXti3N4Wp5xy").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Top Gaming Tracks").callbackData("30444").url("https://open.spotify.com/playlist/37i9dQZF1DWTyiBJ6yEqeu").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Music Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine9(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Water").callbackData("501").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Tea").callbackData("502").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Ice Tea").callbackData("503").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Cocktail(alcohol)").callbackData("504").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Cocktail(no alcohol)").callbackData("505").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Coca-Cola").callbackData("506").build());
        keyboardButtonsRow4.add(InlineKeyboardButton.builder().text("Fanta").callbackData("507").build());
        keyboardButtonsRow4.add(InlineKeyboardButton.builder().text("Sprite").callbackData("508").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        rowList.add(keyboardButtonsRow4);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Other Drinks Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine10(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Takeaway").callbackData("151").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("In Restaurant").callbackData("152").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Takeaway or in Restaurant ?");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine11(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Image 1").callbackData("Pic1").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Image 2").callbackData("Pic2").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Image 3").callbackData("Pic3").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Image 4").callbackData("Pic4").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Image 5").callbackData("Pic5").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Image 6").callbackData("Pic6").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Pictures Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public static SendMessage sndInLine12(long chat_id) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Joke 1").callbackData("joke1").build());
        keyboardButtonsRow1.add(InlineKeyboardButton.builder().text("Joke 2").callbackData("joke2").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Joke 3").callbackData("joke3").build());
        keyboardButtonsRow2.add(InlineKeyboardButton.builder().text("Joke 4").callbackData("joke4").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Joke 5").callbackData("joke5").build());
        keyboardButtonsRow3.add(InlineKeyboardButton.builder().text("Joke 6").callbackData("joke6").build());
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        inlineKeyboardMarkup.setKeyboard(rowList);
        SendMessage msg = new SendMessage();
        msg.setChatId(chat_id);
        msg.setText("Jokes Menu");
        msg.setReplyMarkup(inlineKeyboardMarkup);
        return msg;
    }

    public String getBotUsername() {
        return "cafe_machine_java_bot";
    }

    public String getBotToken() {
        return "5394574138:AAF70UO2i4vSXE80EMO_hp4vWpkCN6ab_4A";
    }

}