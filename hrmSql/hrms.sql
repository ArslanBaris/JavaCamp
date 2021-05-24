BEGIN;

CREATE TABLE public.users
(
    id SERIAL NOT NULL PRIMARY KEY,
    email varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    insert_date date NOT NULL DEFAULT CURRENT_DATE,
    unique(email)
);

CREATE TABLE public.candidates
(
    candidatesID INT NOT NULL,
    firstName varchar(50) NOT NULL,
    lastName varchar(50) NOT NULL,
    nationalIdentity varchar(11) NOT NULL,
    dateOfBirth date NOT NULL,
    PRIMARY KEY(candidatesID),
    FOREIGN KEY(candidatesID) REFERENCES public.users(id) NOT VALID
);

CREATE TABLE public.employers
(
    employersID INT NOT NULL,
    companyName varchar(50) NOT NULL,
    webAddress varchar(100) NOT NULL,
    phoneNumber varchar(13) NOT NULL,
    PRIMARY KEY(employersID),
    FOREIGN KEY(employersID) REFERENCES public.users(id) NOT VALID
);

CREATE TABLE public.employees
(
    employeesID INT NOT NULL,
    firstName varchar(50) NOT NULL,
    lastName varchar(50) NOT NULL,
    PRIMARY KEY(employeesID),
    FOREIGN KEY(employeesID) REFERENCES public.users(id) NOT VALID
);

CREATE TABLE public.activation_codes
(
    id SERIAL NOT NULL PRIMARY KEY,
    user_id int NOT NULL, 
    activation_code text NOT NULL,
    is_confirmed boolean NOT NULL,
    confirm_date date NOT NULL DEFAULT CURRENT_DATE,
    FOREIGN KEY(user_id) REFERENCES public.users(id) NOT VALID
);

CREATE TABLE public.employers_activation_by_employees
(
    id SERIAL NOT NULL PRIMARY KEY,
    employers_id INT NOT NULL,
    employees_id INT NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmed_date date NOT NULL DEFAULT CURRENT_DATE,
    FOREIGN KEY(employers_id) REFERENCES public.employers(employersid),
    FOREIGN KEY(employees_id) REFERENCES public.employees(employeesid)
);

CREATE TABLE public.job_positions
(
    id SERIAL NOT NULL PRIMARY KEY,
    title varchar(50) NOT NULL,
    unique(title)
);

END;
