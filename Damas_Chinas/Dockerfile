FROM nginx:alpine

LABEL org.opencontainers.image.description="Damas-Chines" \
      org.opencontainers.image.authors="Luchop" 

COPY nginx/default.conf /etc/nginx/conf.d/default.conf
COPY nginx/nginx.conf /etc/nginx/nginx.conf

EXPOSE 80
COPY . /usr/share/nginx/htm