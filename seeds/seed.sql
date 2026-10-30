drop database if exists travel_x_db;
create database travel_x_db;
use travel_x_db;
show tables;
desc attractions;
desc bookings;
desc destinations;
desc travel_packages;
desc users;
desc wishlists;
select * from bookings;
select * from users;
select * from travel_packages;

-- destinations
INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Dubai',
'UAE',
'Luxury Redefined',
'Dubai is a ultra-modern city in the United Arab Emirates known for luxury shopping, futuristic architecture, lively nightlife, and the iconic Burj Khalifa.',
'/assets/images/dubai.jpg',
'32°C',
'Nov - March',
4.8,
'Burj Khalifa & Luxury Shopping'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Goa',
'Goa',
'Sun, Sand & Endless Fun',
'Goa is a vibrant coastal state famous for its sandy beaches, spectacular nightlife, 17th-century Portuguese churches, and spice plantations.',
'/assets/images/goa.jpg',
'28°C',
'Nov - Feb',
4.8,
'Beaches & Nightlife'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Jaipur',
'Rajasthan',
'Discover Royal Heritage',
'Jaipur is the capital of Rajasthan, known as the Pink City. It evokes the royal family that once ruled the region with grand palaces and forts.',
'/assets/images/jaipur.jpg',
'30°C',
'Oct - March',
4.6,
'Palaces & Forts'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Kashmir',
'Jammu & Kashmir',
'Heaven on Earth',
'Kashmir is renowned for its unmatched natural beauty, snow-capped Himalayan peaks, iconic Dal Lake shikaras, and pristine valleys.',
'/assets/images/kashmir.jpg',
'10°C',
'March - October',
4.8,
'Dal Lake & Gulmarg Skiing'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Kerala',
'Kerala',
'God''s Own Country',
'Kerala is known for its palm-lined beaches, tranquil backwaters, network of canals, and dense wildlife sanctuaries alongside tea plantations.',
'/assets/images/kerala.jpg',
'25°C',
'Sept - March',
4.9,
'Backwaters & Houseboats'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Kodaikanal',
'Tamil Nadu',
'Princess of Hill Stations',
'Kodaikanal is a misty hill town in Tamil Nadu featuring granite cliffs, wooded forest valleys, serene lakes, and cascading waterfalls.',
'/assets/images/kodaikanal.jpg',
'16°C',
'Sept - May',
4.5,
'Kodaikanal Lake & Pillar Rocks'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Maldives',
'Maldives',
'Island of Dreams',
'The Maldives is a tropical nation in the Indian Ocean composed of 26 ring-shaped atolls, world-famous for crystal overwater bungalows.',
'/assets/images/maldives.jpg',
'29°C',
'Nov - April',
4.9,
'Overwater Villas & Coral Reefs'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Manali',
'Himachal Pradesh',
'Adventure in the Himalayas',
'Nestled in the majestic Himalayas, Manali is known for snow-covered mountains, high-altitude adventure sports, and scenic river valleys.',
'/assets/images/manali.jpg',
'12°C',
'Oct - June',
4.7,
'Solang Valley & Rohtang Pass'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Munnar',
'Kerala',
'Tea Garden Paradise',
'Munnar is a town in the Western Ghats mountain range in Kerala, surrounded by rolling hills dotted with tea plantations established in the 19th century.',
'/assets/images/munnar.jpg',
'18°C',
'Sept - March',
4.7,
'Tea Estates & Anamudi Peak'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Mysore',
'Karnataka',
'City of Royal Grandeur',
'Mysore is famed for its heritage heritage, opulent Mysore Palace, traditional silk sarees, sandalwood products, and grand Dasara celebration.',
'/assets/images/mysore.jpg',
'24°C',
'Oct - March',
4.6,
'Mysore Palace & Chamundi Hill'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Ooty',
'Tamil Nadu',
'Queen of Hill Stations',
'Ooty is a popular resort town in the Nilgiri Hills. Famous for its tea gardens, serene lakes, botanical gardens, and the heritage Nilgiri Toy Train.',
'/assets/images/ooty.jpg',
'17°C',
'Oct - June',
4.5,
'Toy Train & Botanical Gardens'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Paris',
'France',
'Discover Romantic Place',
'Paris is France''s capital and a global center for art, fashion, gastronomy, and culture. Iconic for the Eiffel Tower, Louvre, and Seine River cruises.',
'/assets/images/paris.jpg',
'15°C',
'June - August',
4.6,
'Eiffel Tower & Louvre Museum'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Singapore',
'Singapore',
'Modern & Magical',
'Singapore is a global financial center with a tropical climate and multicultural population, world-renowned for Gardens by the Bay and Marina Bay Sands.',
'/assets/images/singapore.jpg',
'27°C',
'Nov - Jan',
4.6,
'Marina Bay & Gardens by the Bay'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Switzerland',
'Switzerland',
'Alpine Wonderland',
'Switzerland is a mountainous Central European country, home to numerous lakes, villages, and the high peaks of the Alps, ideal for skiing and scenic trains.',
'/assets/images/switzerland.jpg',
'8°C',
'June - August',
4.8,
'Alps, Matterhorn & Chocolates'
);

INSERT INTO destinations (destination_name, state, tagline, description, image_url, weather, best_time_to_visit, rating, famous_for)
VALUES (
'Thailand',
'Thailand',
'Tropical Paradise',
'Thailand is a Southeast Asian country known for tropical beaches, opulent royal palaces, ancient ruins, and ornate temples displaying figures of Buddha.',
'/assets/images/thailand.jpg',
'29°C',
'Nov - April',
4.7,
'Phuket Beaches & Temples'
);

select * from destinations;

-- attractions
-- 1. DUBAI (destination_id = 1)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Burj Khalifa', 1);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('The Dubai Mall & Fountain', 1);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Palm Jumeirah', 1);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Desert Safari Camp', 1);

-- 2. GOA (destination_id = 2)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Baga Beach', 2);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Basilica of Bom Jesus', 2);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Dudhsagar Falls', 2);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Anjuna Flea Market', 2);

-- 3. JAIPUR (destination_id = 3)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Amber Fort', 3);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Hawa Mahal', 3);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('City Palace', 3);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Jantar Mantar', 3);

-- 4. KASHMIR (destination_id = 4)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Dal Lake Shikara Rides', 4);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Gulmarg Gondola', 4);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Pahalgam Valley', 4);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Sonamarg Meadow', 4);

-- 5. KERALA (destination_id = 5)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Alleppey Backwaters', 5);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Athirappilly Waterfalls', 5);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Wayanad Wildlife Sanctuary', 5);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Kovalam Beach', 5);

-- 6. KODAIKANAL (destination_id = 6)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Kodaikanal Lake', 6);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Pillar Rocks', 6);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Coaker''s Walk', 6);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Silver Cascade Falls', 6);

-- 7. MALDIVES (destination_id = 7)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Maafushi Island', 7);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Banana Reef', 7);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Hulhumalé Beach', 7);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Male Friday Mosque', 7);

-- 8. MANALI (destination_id = 8)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Solang Valley', 8);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Rohtang Pass', 8);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Hadimba Temple', 8);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Beas River', 8);

-- 9. MUNNAR (destination_id = 9)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Tea Museum & Estates', 9);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Anamudi Peak', 9);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Mattupetty Dam', 9);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Eravikulam National Park', 9);

-- 10. MYSORE (destination_id = 10)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Mysore Palace', 10);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Chamundi Hill Temple', 10);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Brindavan Gardens', 10);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Mysore Zoo', 10);

-- 11. OOTY (destination_id = 11)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Ooty Botanical Gardens', 11);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Ooty Lake', 11);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Doddabetta Peak', 11);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Nilgiri Toy Train', 11);

-- 12. PARIS (destination_id = 12)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Eiffel Tower', 12);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Louvre Museum', 12);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Notre-Dame Cathedral', 12);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Arc de Triomphe', 12);

-- 13. SINGAPORE (destination_id = 13)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Gardens by the Bay', 13);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Marina Bay Sands SkyPark', 13);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Sentosa Island', 13);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Universal Studios Singapore', 13);

-- 14. SWITZERLAND (destination_id = 14)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('The Matterhorn', 14);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Jungfraujoch (Top of Europe)', 14);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Lake Geneva', 14);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Mount Pilatus', 14);

-- 15. THAILAND (destination_id = 15)
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Grand Palace Bangkok', 15);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Phi Phi Islands', 15);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Wat Arun Temple', 15);
INSERT INTO attractions (attraction_name, destination_id) VALUES ('Chiang Mai Night Bazaar', 15);

-- Verify inserted data
SELECT * FROM attractions;

-- travel packages
INSERT INTO travel_packages (package_name, duration_days, duration_nights, price, accommodation, transportation, meals, activities, destination_id, image_url)
VALUES 
('Manali Explorer', 4, 3, 12999.00, 'Deluxe Hotel Stay', 'Cab for Local Sightseeing', 'Breakfast & Dinner included', 'Paragliding', 1, '/assets/images/manali.jpg'),
('Manali Adventure', 6, 5, 18500.00, '3-Star Premium Hotel', 'AC Sedan Pickup & Drop', 'Breakfast included', 'Sightseeing', 1, '/assets/images/manali.jpg'),
('Manali Premium', 5, 4, 28000.00, '5-Star Luxury Resort with Mountain View', 'Private Premium SUV', 'All Meals (Buffet)', 'Snow Skiing', 1, '/assets/images/manali.jpg'),

('Goa Beach Getaway', 3, 2, 7999.00, 'Beach Resort', 'AC Bus', 'Breakfast', 'Water Sports', 2, '/assets/images/goa.jpg'),
('Goa Explorer', 4, 3, 11999.00, 'Premium Hotel', 'Private Cab', 'Breakfast & Dinner', 'Sunset Cruise', 2, '/assets/images/goa.jpg'),
('Goa Premium Luxury', 5, 4, 18999.00, '5-Star Resort', 'Flight + Private Cab', 'All Meals', 'Scuba Diving', 2, '/assets/images/goa.jpg'),

('Kerala Houseboat & Backwater Cruise', 4, 3, 14999.00, 'Private Luxury Houseboat', 'AC Cab for Pickup & Drop', 'All Meals cooked onboard', 'Backwater Cruising', 3, '/assets/images/kerala.jpg'),
('Munnar Tea Hills & Wildlife Getaway', 5, 4, 17500.00, 'Hills-view Eco Resort', 'Private AC Sedan', 'Breakfast & Dinner', 'Tea Garden Walk', 3, '/assets/images/kerala.jpg'),
('Grand Kerala Tour', 8, 7, 34000.00, 'Premium Hotels & Houseboat', 'Private AC SUV', 'Breakfasts & Houseboat Meals', 'Wildlife Safari', 3, '/assets/images/kerala.jpg'),

('Jaipur Cultural Weekend Getaway', 3, 2, 7500.00, 'Royal Heritage Guest House', 'Local Auto & Cab Guide', 'Traditional Rajasthani Food', 'Elephant Ride', 4, '/assets/images/jaipur.jpg'),
('Royal Rajasthan Heritage Explorer', 6, 5, 19999.00, 'Heritage Haveli Hotel', 'AC Private Sedan', 'Breakfast & Lunch', 'Fort Trekking', 4, '/assets/images/jaipur.jpg'),
('Luxury Palace Heritage Experience', 4, 3, 29999.00, 'Authentic Palace Stay', 'Private Premium Sedan', 'Premium Dining Included', 'Folk Dancing', 4, '/assets/images/jaipur.jpg'),

('Parisian Romance & Seine Cruise', 5, 4, 85000.00, 'Boutique Parisian Hotel', 'Metro Passes & Airport Cab', 'Daily French Breakfast', 'Eiffel Tower Climbing', 5, '/assets/images/paris.jpg'),
('Paris Art & History Explorer', 6, 5, 110000.00, 'Cozy Hotel near Louvre', 'Hop-on Hop-off Bus Pass', 'Breakfast & Wine Tasting Lunch', 'Museum Tour', 5, '/assets/images/paris.jpg'),
('Luxury Paris Fashion & Food Tour', 4, 3, 150000.00, 'Luxury Suite', 'Private Chauffeur', 'Michelin Star Dinner & Breakfasts', 'Cooking Class', 5, '/assets/images/paris.jpg'),

('Leh Ladakh Legendary Bike Expedition', 8, 7, 25000.00, 'Cozy Homestays & Adventure Tents', 'Royal Enfield Bike with Fuel', 'Breakfast & Dinner', 'Bike Riding', 6, '/assets/images/kashmir.jpg'),
('Pangong Tso & Nubra Valley Scenic Tour', 6, 5, 19500.00, '3-Star Hotel & Luxury Camps', 'Private 4x4 Bolero/Scorpio', 'Breakfast & Dinner', 'Camel Riding', 6, '/assets/images/kashmir.jpg'),
('Ladakh Cultural & Serene Monastery Tour', 5, 4, 16000.00, 'Premium Eco Lodge in Leh', 'Private AC Cab', 'All Organic Meals Included', 'Monastery Visit', 6, '/assets/images/kashmir.jpg'),

('Taj Mahal Golden Triangle Express', 2, 1, 4999.00, 'Standard 3-Star Stay', 'AC Cab from Delhi Roundtrip', 'Breakfast Included', 'Taj Mahal Tour', 7, '/assets/images/jaipur.jpg'),
('Agra Mughal Heritage & Craft Tour', 3, 2, 8500.00, 'Premium Hotel', 'AC Private Hatchback', 'Breakfast & Mughlai Dinner', 'Marble Crafting', 7, '/assets/images/jaipur.jpg'),
('Luxury Taj Mahal View Stay', 2, 1, 16000.00, 'Luxury Resort (Taj View Room)', 'Private Luxury Sedan', 'Gourmet Dinner & Buffet Breakfast', 'Fort Photography', 7, '/assets/images/jaipur.jpg'),

('Bali Tropical Beaches & Sunset Tour', 5, 4, 35000.00, 'Cozy Beachside Resort', 'Airport Cab & Scooter Hire', 'Daily Tropical Breakfast', 'Surfing', 8, '/assets/images/maldives.jpg'),
('Ubud Spiritual & Nature Escape', 6, 5, 42000.00, 'Jungle View Ubud Resort', 'AC Premium Car', 'Breakfast & Organic Lunch', 'Volcano Trekking', 8, '/assets/images/maldives.jpg'),
('Luxury Bali Private Pool Villa Getaway', 7, 6, 75000.00, 'Ultra-Luxury Private Pool Villa', 'Private SUV with Chauffeur', 'All Meals & Floating Breakfast', 'Traditional Dance', 8, '/assets/images/maldives.jpg'),

('Ancient Rome & Colosseum Walking Tour', 4, 3, 72000.00, 'Charming Guest House', 'Local City Transit Pass', 'Daily Italian Breakfast', 'Colosseum Tour', 9, '/assets/images/paris.jpg'),
('Rome & Vatican Museum Art Special', 5, 4, 95000.00, 'Premium Hotel near Vatican', 'Hop-on Hop-off Bus Pass', 'Breakfast & Wine Tasting Pairing', 'Museum Exploration', 9, '/assets/images/paris.jpg'),
('Luxury Roman Holiday & Culinary Tour', 6, 5, 130000.00, 'Luxury Boutique Hotel', 'Private Premium Chauffeur', 'All Meals (Michelin & Traditional)', 'Pasta Cooking', 9, '/assets/images/paris.jpg'),

('Ooty Hills & Heritage Toy Train Special', 3, 2, 6999.00, 'Cozy Colonial Cottage', 'Private Local Taxi', 'Breakfast Included', 'Toy Train Ride', 10, '/assets/images/ooty.jpg'),
('Scenic Ooty & Coonoor Retreat', 4, 3, 10500.00, 'Valley View Resort', 'AC Sedan Pickup & Sightseeing', 'Breakfast & Valley View Dinner', 'Lake Boating', 10, '/assets/images/ooty.jpg'),
('Luxury Tea Estate Bungalow Stay', 5, 4, 18000.00, 'Charming Private Tea Estate Bungalow', 'Private Premium SUV', 'All Meals (Farm-to-Table)', 'Tea Tasting', 10, '/assets/images/ooty.jpg'),

('Dubai Skyscraper & Desert Adventure', 5, 4, 45000.00, '4-Star City Hotel', 'Private AC Cab', 'Breakfast Included', 'Desert Safari & Burj Khalifa', 11, '/assets/images/dubai.jpg'),
('Dubai Luxury & Marina Cruise', 6, 5, 75000.00, '5-Star Luxury Resort', 'Private SUV Transfers', 'Breakfast & Dinner Cruise', 'Dhow Cruise & Shopping', 11, '/assets/images/dubai.jpg'),
('Dubai Royal Experience', 4, 3, 110000.00, '7-Star Luxury Hotel', 'Chauffeur Driven Sedan', 'All Meals Included', 'Helicopter Tour', 11, '/assets/images/dubai.jpg'),

('Kodaikanal Lake & Forest Escape', 3, 2, 5999.00, 'Hillside Cottage', 'Private Taxi', 'Breakfast Included', 'Boating & Trekking', 12, '/assets/images/kodaikanal.jpg'),
('Kodaikanal Mist & Valley Explorer', 4, 3, 9500.00, 'Valley View Resort', 'AC Sedan Sightseeing', 'Breakfast & Dinner', 'Pillar Rocks & Coaker Walk', 12, '/assets/images/kodaikanal.jpg'),
('Kodaikanal Luxury Pine Resort Stay', 5, 4, 16000.00, 'Luxury Heritage Resort', 'Private SUV', 'All Meals Included', 'Private Forest Tour', 12, '/assets/images/kodaikanal.jpg'),

('Maldives Water Villa Island Paradise', 4, 3, 89000.00, 'Overwater Bungalow', 'Speedboat Transfer', 'All Inclusive Meals', 'Snorkeling & Scuba', 13, '/assets/images/maldives.jpg'),
('Maldives Romantic Beach Resort', 5, 4, 120000.00, 'Beachfront Private Villa', 'Seaplane Transfer', 'Breakfast & Candlelight Dinner', 'Sunset Cruise', 13, '/assets/images/maldives.jpg'),
('Maldives Ultra Luxury Escape', 6, 5, 210000.00, 'Private Island Villa with Pool', 'Luxury Yacht Transfer', 'All Inclusive Michelin Dining', 'Private Spa & Diving', 13, '/assets/images/maldives.jpg'),

('Munnar Tea Gardens Weekend', 3, 2, 6500.00, 'Tea Estate Bungalow', 'AC Cab', 'Breakfast Included', 'Tea Factory Tour', 14, '/assets/images/munnar.jpg'),
('Munnar Hills & Waterfall Special', 4, 3, 10500.00, 'Mountain View Resort', 'Private Sedan', 'Breakfast & Dinner', 'Eravikulam Park Tour', 14, '/assets/images/munnar.jpg'),
('Munnar Luxury Nature Retreat', 5, 4, 17500.00, '5-Star Eco Resort', 'Private SUV', 'All Meals Included', 'Trekking & Wildlife Safari', 14, '/assets/images/munnar.jpg'),

('Mysore Royal Heritage Tour', 3, 2, 5500.00, 'Heritage Hotel', 'Local Auto & Cab', 'Breakfast Included', 'Palace Tour & Light Show', 15, '/assets/images/mysore.jpg'),
('Mysore Palace & Silk Explorer', 4, 3, 8999.00, '4-Star City Hotel', 'Private AC Sedan', 'Breakfast & Dinner', 'Silk & Spice Market Tour', 15, '/assets/images/mysore.jpg'),
('Mysore Grand Royal Experience', 5, 4, 15000.00, 'Palace Hotel Stay', 'Private Chauffeur SUV', 'All Meals Included', 'Private Palace Guide', 15, '/assets/images/mysore.jpg');

SELECT * FROM travel_packages;
