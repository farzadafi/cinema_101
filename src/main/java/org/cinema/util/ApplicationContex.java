package org.cinema.util;

import org.cinema.repository.*;
import org.cinema.service.*;

import java.sql.Connection;
@SuppressWarnings("unused")
public class ApplicationContex {
    private static final Connection connertion;
    private static final UserRepository userRepository;
    private static final UserService userService;
    private static final AdminRepository adminRepository;
    private static final AdminService adminService;
    private static final CinemaRepository cinemaRepository;
    private static final CinemaService cinemaService;
    private static final BasketRepository basketRepository;
    private static final BasketService basketService;
    private static final TicketRepository ticketRepository;
    private static final TicketService ticketService;


    static {
        connertion =DataSourse.getConnection();
        userRepository =new UserRepository(connertion);
        userService = new UserService(userRepository);
        adminRepository = new AdminRepository(connertion);
        adminService = new AdminService(adminRepository);
        cinemaRepository =new CinemaRepository(connertion);
        cinemaService = new CinemaService(cinemaRepository);
        basketRepository =new BasketRepository(connertion);
        basketService =new BasketService(basketRepository);
        ticketRepository =new TicketRepository(connertion);
        ticketService =new TicketService(ticketRepository);

    }
    public static UserService getUserService(){return userService; }
    public static AdminService getAdminService(){return adminService; }
    public static BasketService getBasketService(){return basketService; }
    public static CinemaService getCinemaService(){return cinemaService; }
    public static TicketService getTicketService(){return ticketService; }


}
