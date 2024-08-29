CREATE TABLE IF NOT EXISTS general_expense_category (
    id UUID PRIMARY KEY,
    category_name TEXT NOT NULL,
    category_img_url TEXT
);

CREATE TABLE IF NOT EXISTS person_specific_expense_category (
    id UUID PRIMARY KEY,
    category_name TEXT NOT NULL,
    category_img_url TEXT,
    person_id UUID NOT NULL,
    FOREIGN KEY (person_id) REFERENCES person(id)
);