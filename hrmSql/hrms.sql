BEGIN;

CREATE TABLE public.users
(
    id SERIAL NOT NULL PRIMARY KEY,
    email varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
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
    activation_code text NOT NULL,
    is_confirmed boolean NOT NULL,
    confirm_date date
);


CREATE TABLE public.activation_code_candidates
(
    id INT NOT NULL PRIMARY KEY,
    candidate_id INT NOT NULL,
    FOREIGN KEY(candidate_id) REFERENCES public.candidates(candidatesid),
    FOREIGN KEY(id) REFERENCES public.activation_codes(id)
);

CREATE TABLE public.activation_code_employers
(
    id INT NOT NULL PRIMARY KEY,
    employer_id integer NOT NULL,
    FOREIGN KEY(employer_id) REFERENCES public.employers(employersid),
    FOREIGN KEY(id) REFERENCES public.activation_codes(id)
);

CREATE TABLE public.employers_activation_by_employees
(
    id SERIAL NOT NULL PRIMARY KEY,
    employers_id INT NOT NULL,
    employees_id INT NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmed_date date NOT NULL,
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